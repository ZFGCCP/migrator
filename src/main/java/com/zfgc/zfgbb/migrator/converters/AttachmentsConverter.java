package com.zfgc.zfgbb.migrator.converters;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zfgc.zfgbb.migrator.db.ContentResourceDbo;
import com.zfgc.zfgbb.migrator.db.ContentResourceDboExample;
import com.zfgc.zfgbb.migrator.db.FileAttachmentDbo;
import com.zfgc.zfgbb.migrator.db.FileAttachmentDboExample;
import com.zfgc.zfgbb.migrator.db.MessageDbo;
import com.zfgc.zfgbb.migrator.mappers.ContentResourceDboMapper;
import com.zfgc.zfgbb.migrator.mappers.FileAttachmentDboMapper;
import com.zfgc.zfgbb.migrator.mappers.MessageDboMapper;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFAttachmentsDbExample;
import com.zfgc.zfgbb.migrator.smf.mappers.SMFAttachmentsDbMapper;

@Component
public class AttachmentsConverter extends AbstractConverter {

	@Autowired
	private SMFAttachmentsDbMapper smfAttachmentsDbMapper;
	
	@Autowired
	private ContentResourceDboMapper contentMapper;
	
	@Autowired
	private MessageDboMapper messageMapper;
	
	@Autowired
	private FileAttachmentDboMapper attachmentMapper;
	
	@Transactional
	public Map<Integer,ContentResourceDbo> convertToZfgbb() {
		
		SMFAttachmentsDbExample attachEx = new SMFAttachmentsDbExample();
		attachEx.createCriteria().andIdMsgGreaterThan(0);
		
		Integer maxContentRecordId = Optional.of(contentMapper.getMaxRecordId()).orElse(0);
		AtomicInteger contentId = new AtomicInteger(maxContentRecordId);
		
		return smfAttachmentsDbMapper.selectByExample(attachEx).stream().map(attachment -> {
			
			//get the message this attachment belongs to
			MessageDbo msg = messageMapper.selectByPrimaryKey(attachment.getIdMsg());
			
			ContentResourceDbo resource = new ContentResourceDbo();
			resource.setContentResourceId(contentId.getAndIncrement());
			resource.setContentTypeId(2);
			resource.setChecksum(attachment.getFileHash());
			resource.setFileExt(attachment.getFileext());
			resource.setFilename(attachment.getFilename());
			resource.setMimeType(attachment.getMimeType());
			resource.setUploadedUserId(msg.getOwnerId());
			resource.setFileSize(attachment.getSize().longValue());
			try {
				resource.setMigrationHash(resource.computeHash());
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			ContentResourceDboExample existingResourceEx = new ContentResourceDboExample();
			existingResourceEx.createCriteria().andContentResourceIdEqualTo(resource.getContentResourceId());
			contentMapper.selectByExample(existingResourceEx).stream()
													.findFirst()
													.ifPresentOrElse(existing -> {
														if(!existing.getMigrationHash().equals(resource.getMigrationHash())) {
															contentMapper.updateByPrimaryKey(resource);
														}
													}, 
													() -> {
														contentMapper.insert(resource);
													});
			
			
			//create the file attachment record
			FileAttachmentDbo fileAttachment = new FileAttachmentDbo();
			fileAttachment.setFileAttachmentId(attachment.getIdAttach());
			fileAttachment.setActiveFlag(attachment.getApproved().intValue() == 1);
			fileAttachment.setContentResourceId(resource.getContentResourceId());
			fileAttachment.setMessageId(msg.getMessageId());
			fileAttachment.setDownloads(attachment.getDownloads());
			try {
				fileAttachment.setMigrationHash(fileAttachment.computeHash());
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FileAttachmentDboExample existingAttachmentEx = new FileAttachmentDboExample();
			existingAttachmentEx.createCriteria().andFileAttachmentIdEqualTo(fileAttachment.getFileAttachmentId());
			
			attachmentMapper.selectByExample(existingAttachmentEx)
							.stream()
							.findFirst()
							.ifPresentOrElse(
								existing -> {
									if(!existing.getMigrationHash().equals(fileAttachment.getMigrationHash())) {
										attachmentMapper.updateByPrimaryKey(fileAttachment);
									}
								},
								() -> {
									attachmentMapper.insert(fileAttachment);
								}
							);
			
			return resource;
			
		}).collect(Collectors.toMap(ContentResourceDbo::getContentResourceId, Function.identity()));
	}
}
