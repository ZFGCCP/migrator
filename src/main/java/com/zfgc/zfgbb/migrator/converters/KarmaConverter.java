package com.zfgc.zfgbb.migrator.converters;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import com.zfgc.zfgbb.migrator.db.KarmaDbo;
import com.zfgc.zfgbb.migrator.db.KarmaDboExample;
import com.zfgc.zfgbb.migrator.mappers.KarmaDboMapper;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFLogKarmaDb;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFLogKarmaDbExample;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFLogKarmaDbWithBLOBs;
import com.zfgc.zfgbb.migrator.smf.mappers.SMFLogKarmaDbMapper;

@Component
public class KarmaConverter {
	
	@Autowired
	private KarmaDboMapper karmaMapper;
	
	@Autowired
	private SMFLogKarmaDbMapper SMFKarmaMapper;
	
	private final String MSG_REGEX = "[0-9]+$";
	
	public Map<Integer, KarmaDbo> convertToZfgbb(){
		List<SMFLogKarmaDbWithBLOBs> karmaSMF = SMFKarmaMapper.selectByExampleWithBLOBs(new SMFLogKarmaDbExample());
		Pattern pattern = Pattern.compile(MSG_REGEX);
		
		
		return karmaSMF.stream()
				.map(karma -> {
					try {
						Matcher matcher = pattern.matcher(karma.getLink());
						matcher.find();
						Integer msgId =Integer.parseInt(matcher.group());
						
						KarmaDbo karmaPg = KarmaDbo.builder()
												 .commentingUserId(karma.getIdExecutor())
												 .createdTs(karma.getLogTimeAsTime())
												 .updatedTs(karma.getLogTimeAsTime())
												 .isPositive(karma.getAction().equals(1))
												 .messageId(msgId)
												 .description(karma.getDescription())
												 .build();
						try {
							karmaPg.setMigrationId(karmaPg.computeHash());
						} catch (NoSuchAlgorithmException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						KarmaDboExample ex = new KarmaDboExample();
						ex.createCriteria().andMigrationIdEqualTo(karmaPg.getMigrationId());
						
						Optional<KarmaDbo> existing = karmaMapper.selectByExample(ex).stream().findFirst();
						existing.ifPresentOrElse(ext -> {
							karmaPg.setKarmaId(ext.getKarmaId());
							karmaMapper.updateByPrimaryKey(karmaPg);
						}, () ->{
							karmaMapper.insert(karmaPg);
						});
						
						return karmaPg;
					}
					catch(DataIntegrityViolationException dEx) {
						if(dEx.getMessage().contains("message_id")) {
							//SMF can sometimes have a karma record that belongs to a deleted message (no referential integrity in the SMF db since it's just a link)
							return null;
						}
						else {
							throw dEx;
						}
					}
					
				})
				.filter(km -> km != null)
				.collect(Collectors.toMap(KarmaDbo::getKarmaId, Function.identity()));
	}
}
