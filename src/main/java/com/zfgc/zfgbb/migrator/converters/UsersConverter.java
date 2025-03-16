package com.zfgc.zfgbb.migrator.converters;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zfgc.zfgbb.migrator.db.UserDbo;
import com.zfgc.zfgbb.migrator.db.UserDboExample;
import com.zfgc.zfgbb.migrator.mappers.UserDboMapper;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFMembersDbExample;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFMembersDbWithBLOBs;
import com.zfgc.zfgbb.migrator.smf.mappers.SMFMembersDbMapper;

@Component
public class UsersConverter {
	
	@Autowired
	public SMFMembersDbMapper smfMembersMapper;
	
	@Autowired
	public UserDboMapper userDboMapper;
	
	@Transactional
	public Map<Integer,UserDbo> convertToZfgbb() {
		List<SMFMembersDbWithBLOBs> SMFMembers = smfMembersMapper.selectByExampleWithBLOBs(new SMFMembersDbExample());
		Map<Integer,UserDbo> result = new HashMap<>();
		
		SMFMembers.forEach((smfMember) -> {
			UserDbo user = new UserDbo();
			
			user.setUserId(smfMember.getIdMember());
			user.setDisplayName(smfMember.getRealName());
			user.setSsoKey(smfMember.getMemberName());
			user.setUserName(smfMember.getMemberName());
			user.setActiveFlag(smfMember.getIsActivated().intValue() > 0);
			
			try {
				user.setMigrationHash(user.computeHash());
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			result.put(user.getUserId(), user);
			
			
			UserDbo existingUser = userDboMapper.selectByPrimaryKey(user.getUserId());
			if(existingUser == null) {
				userDboMapper.insert(user);
			}
			else if(!existingUser.getMigrationHash().equals(user.getMigrationHash())) {
				userDboMapper.updateByPrimaryKey(user);
			}
		});
		
		return result;
	}
	
}
