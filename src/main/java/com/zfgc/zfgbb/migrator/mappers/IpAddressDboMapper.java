package com.zfgc.zfgbb.migrator.mappers;

import com.zfgc.zfgbb.migrator.db.IpAddressDbo;
import com.zfgc.zfgbb.migrator.db.IpAddressDboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpAddressDboMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	long countByExample(IpAddressDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	int deleteByExample(IpAddressDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	int deleteByPrimaryKey(Integer ipAddressId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	int insert(IpAddressDbo row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	int insertSelective(IpAddressDbo row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	List<IpAddressDbo> selectByExample(IpAddressDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	IpAddressDbo selectByPrimaryKey(Integer ipAddressId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	int updateByExampleSelective(@Param("row") IpAddressDbo row, @Param("example") IpAddressDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	int updateByExample(@Param("row") IpAddressDbo row, @Param("example") IpAddressDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	int updateByPrimaryKeySelective(IpAddressDbo row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.ip_address
	 * @mbg.generated  Sun Feb 16 18:12:58 EST 2025
	 */
	int updateByPrimaryKey(IpAddressDbo row);
}