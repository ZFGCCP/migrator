package com.zfgc.zfgbb.migrator.converters;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zfgc.zfgbb.migrator.db.CategoryDbo;
import com.zfgc.zfgbb.migrator.mappers.CategoryDboMapper;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFCategoryDb;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFCategoryDbExample;
import com.zfgc.zfgbb.migrator.smf.mappers.SMFCategoryDbMapper;

@Component
public class CategoryConverter extends AbstractConverter {
	
	@Autowired
	public SMFCategoryDbMapper smfCategoryMapper;
	
	@Autowired
	public CategoryDboMapper categoryDboMapper;
	
	public Map<Integer,CategoryDbo> convertToZfgbb() {
		List<SMFCategoryDb> SMFCategories = smfCategoryMapper.selectByExample(new SMFCategoryDbExample());
		Map<Integer,CategoryDbo> result = new HashMap<>();
		
		SMFCategories.forEach((smfCategory) -> {
			CategoryDbo cat = new CategoryDbo();
			
			cat.setCategoryId(smfCategory.getIdCat());
			cat.setCategoryName(smfCategory.getName());
			
			try {
				cat.setMigrationHash(cat.computeHash());
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			result.put(cat.getCategoryId(), cat);
			
			
			CategoryDbo existingCat = categoryDboMapper.selectByPrimaryKey(cat.getCategoryId());
			if(existingCat == null) {
				categoryDboMapper.insert(cat);
			}
			else if(!existingCat.getMigrationHash().equals(cat.getMigrationHash())) {
				categoryDboMapper.updateByPrimaryKey(cat);
			}
		});
		
		return result;
	}
}
