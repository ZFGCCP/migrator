package com.zfgc.zfgbb.migrator.mappers;

import com.zfgc.zfgbb.migrator.db.ThreadDbo;
import com.zfgc.zfgbb.migrator.db.ThreadDboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThreadDboMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	long countByExample(ThreadDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	int deleteByExample(ThreadDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	int deleteByPrimaryKey(Integer threadId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	int insert(ThreadDbo row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	int insertSelective(ThreadDbo row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	List<ThreadDbo> selectByExample(ThreadDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	ThreadDbo selectByPrimaryKey(Integer threadId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	int updateByExampleSelective(@Param("row") ThreadDbo row, @Param("example") ThreadDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	int updateByExample(@Param("row") ThreadDbo row, @Param("example") ThreadDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	int updateByPrimaryKeySelective(ThreadDbo row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.thread
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	int updateByPrimaryKey(ThreadDbo row);
}