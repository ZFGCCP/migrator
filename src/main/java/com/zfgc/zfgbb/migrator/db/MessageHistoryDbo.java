package com.zfgc.zfgbb.migrator.db;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

public class MessageHistoryDbo extends AbstractPostgresDb {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.message_history.message_history_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	private Integer messageHistoryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.message_history.message_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	private Integer messageId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.message_history.message_text
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	private String messageText;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.message_history.current_flag
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	private Boolean currentFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.message_history.created_ts
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	private LocalDateTime createdTs;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.message_history.updated_ts
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	private LocalDateTime updatedTs;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.message_history.ip_address_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	private Integer ipAddressId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.message_history.migration_hash
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	private String migrationHash;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.message_history.legacy_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	private Integer legacyId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.message_history.message_history_id
	 * @return  the value of zfgbb.message_history.message_history_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public Integer getMessageHistoryId() {
		return messageHistoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.message_history.message_history_id
	 * @param messageHistoryId  the value for zfgbb.message_history.message_history_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public void setMessageHistoryId(Integer messageHistoryId) {
		this.messageHistoryId = messageHistoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.message_history.message_id
	 * @return  the value of zfgbb.message_history.message_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public Integer getMessageId() {
		return messageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.message_history.message_id
	 * @param messageId  the value for zfgbb.message_history.message_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.message_history.message_text
	 * @return  the value of zfgbb.message_history.message_text
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public String getMessageText() {
		return messageText;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.message_history.message_text
	 * @param messageText  the value for zfgbb.message_history.message_text
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.message_history.current_flag
	 * @return  the value of zfgbb.message_history.current_flag
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public Boolean getCurrentFlag() {
		return currentFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.message_history.current_flag
	 * @param currentFlag  the value for zfgbb.message_history.current_flag
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public void setCurrentFlag(Boolean currentFlag) {
		this.currentFlag = currentFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.message_history.created_ts
	 * @return  the value of zfgbb.message_history.created_ts
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public LocalDateTime getCreatedTs() {
		return createdTs;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.message_history.created_ts
	 * @param createdTs  the value for zfgbb.message_history.created_ts
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public void setCreatedTs(LocalDateTime createdTs) {
		this.createdTs = createdTs;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.message_history.updated_ts
	 * @return  the value of zfgbb.message_history.updated_ts
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public LocalDateTime getUpdatedTs() {
		return updatedTs;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.message_history.updated_ts
	 * @param updatedTs  the value for zfgbb.message_history.updated_ts
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public void setUpdatedTs(LocalDateTime updatedTs) {
		this.updatedTs = updatedTs;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.message_history.ip_address_id
	 * @return  the value of zfgbb.message_history.ip_address_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public Integer getIpAddressId() {
		return ipAddressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.message_history.ip_address_id
	 * @param ipAddressId  the value for zfgbb.message_history.ip_address_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public void setIpAddressId(Integer ipAddressId) {
		this.ipAddressId = ipAddressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.message_history.migration_hash
	 * @return  the value of zfgbb.message_history.migration_hash
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public String getMigrationHash() {
		return migrationHash;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.message_history.migration_hash
	 * @param migrationHash  the value for zfgbb.message_history.migration_hash
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public void setMigrationHash(String migrationHash) {
		this.migrationHash = migrationHash;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.message_history.legacy_id
	 * @return  the value of zfgbb.message_history.legacy_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public Integer getLegacyId() {
		return legacyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.message_history.legacy_id
	 * @param legacyId  the value for zfgbb.message_history.legacy_id
	 * @mbg.generated  Mon Feb 17 22:12:59 EST 2025
	 */
	public void setLegacyId(Integer legacyId) {
		this.legacyId = legacyId;
	}

	@Override
	public String computeHash() throws NoSuchAlgorithmException {
		return super.calculateHashInternal(
											messageId
											+ messageText
											+ currentFlag.toString()
											+ createdTs.toString()
											+ (updatedTs == null ? 0 : updatedTs.toString())
											+ ipAddressId
											+ legacyId
										  );
	}
}