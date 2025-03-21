package com.zfgc.zfgbb.migrator.smf.mappers;

import com.zfgc.zfgbb.migrator.smf.dbo.SMFCategoryDb;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFCategoryDbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SMFCategoryDbMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	long countByExample(SMFCategoryDbExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	int deleteByExample(SMFCategoryDbExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	int deleteByPrimaryKey(Integer idCat);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	int insert(SMFCategoryDb row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	int insertSelective(SMFCategoryDb row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	List<SMFCategoryDb> selectByExample(SMFCategoryDbExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	SMFCategoryDb selectByPrimaryKey(Integer idCat);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	int updateByExampleSelective(@Param("row") SMFCategoryDb row, @Param("example") SMFCategoryDbExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	int updateByExample(@Param("row") SMFCategoryDb row, @Param("example") SMFCategoryDbExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	int updateByPrimaryKeySelective(SMFCategoryDb row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table smf_1categories
	 * @mbg.generated  Mon Feb 10 19:48:50 EST 2025
	 */
	int updateByPrimaryKey(SMFCategoryDb row);
}