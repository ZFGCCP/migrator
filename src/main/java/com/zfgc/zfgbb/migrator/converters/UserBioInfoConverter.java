package com.zfgc.zfgbb.migrator.converters;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zfgc.zfgbb.migrator.db.UserBioInfoDbo;
import com.zfgc.zfgbb.migrator.db.UserDbo;
import com.zfgc.zfgbb.migrator.mappers.UserBioInfoDboMapper;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFMembersDbExample;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFMembersDbWithBLOBs;
import com.zfgc.zfgbb.migrator.smf.mappers.SMFMembersDbMapper;

@Component
public class UserBioInfoConverter {
	
	@Autowired
	public SMFMembersDbMapper smfMembersMapper;
	
	@Autowired
	public UserBioInfoDboMapper bioInfoMapper;
	
	@Transactional
	public Map<Integer,UserBioInfoDbo> convertToZfgbb() {
		List<SMFMembersDbWithBLOBs> SMFMembers = smfMembersMapper.selectByExampleWithBLOBs(new SMFMembersDbExample());
		Map<Integer,UserBioInfoDbo> result = new HashMap<>();
		
		SMFMembers.forEach((smfMember) -> {
			UserBioInfoDbo user = new UserBioInfoDbo();
			
			user.setUserId(smfMember.getIdMember());
			user.setCustomTitle(smfMember.getUsertitle());
			user.setPersonalText(smfMember.getPersonalText());
			user.setSignature(smfMember.getSignature());
			
			try {
				user.setMigrationHash(user.computeHash());
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			result.put(user.getUserId(), user);
			
			
			UserBioInfoDbo existingUser = bioInfoMapper.selectByPrimaryKey(user.getUserId());
			if(existingUser == null) {
				bioInfoMapper.insert(user);
			}
			else if(!existingUser.getMigrationHash().equals(user.getMigrationHash())) {
				bioInfoMapper.updateByPrimaryKey(user);
			}
		});
		
		return result;
	}
}
