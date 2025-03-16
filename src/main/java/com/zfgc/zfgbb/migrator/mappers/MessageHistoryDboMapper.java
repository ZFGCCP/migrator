package com.zfgc.zfgbb.migrator.mappers;

import com.zfgc.zfgbb.migrator.db.MessageHistoryDbo;
import com.zfgc.zfgbb.migrator.db.MessageHistoryDboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageHistoryDboMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	long countByExample(MessageHistoryDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	int deleteByExample(MessageHistoryDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	int deleteByPrimaryKey(Integer messageHistoryId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	int insert(MessageHistoryDbo row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	int insertSelective(MessageHistoryDbo row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	List<MessageHistoryDbo> selectByExample(MessageHistoryDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	MessageHistoryDbo selectByPrimaryKey(Integer messageHistoryId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	int updateByExampleSelective(@Param("row") MessageHistoryDbo row,
			@Param("example") MessageHistoryDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	int updateByExample(@Param("row") MessageHistoryDbo row, @Param("example") MessageHistoryDboExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	int updateByPrimaryKeySelective(MessageHistoryDbo row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.message_history
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	int updateByPrimaryKey(MessageHistoryDbo row);
}