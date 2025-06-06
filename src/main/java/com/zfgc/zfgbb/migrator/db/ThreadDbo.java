package com.zfgc.zfgbb.migrator.db;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

public class ThreadDbo extends AbstractPostgresDb {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.thread_id
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private Integer threadId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.thread_name
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private String threadName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.locked_flag
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private Boolean lockedFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.pinned_flag
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private Boolean pinnedFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.created_ts
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private LocalDateTime createdTs;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.updated_ts
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private LocalDateTime updatedTs;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.board_id
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private Integer boardId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.created_user_id
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private Integer createdUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.view_count
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private Integer viewCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column zfgbb.thread.migration_hash
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	private String migrationHash;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.thread_id
	 * @return  the value of zfgbb.thread.thread_id
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public Integer getThreadId() {
		return threadId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.thread_id
	 * @param threadId  the value for zfgbb.thread.thread_id
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setThreadId(Integer threadId) {
		this.threadId = threadId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.thread_name
	 * @return  the value of zfgbb.thread.thread_name
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public String getThreadName() {
		return threadName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.thread_name
	 * @param threadName  the value for zfgbb.thread.thread_name
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.locked_flag
	 * @return  the value of zfgbb.thread.locked_flag
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public Boolean getLockedFlag() {
		return lockedFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.locked_flag
	 * @param lockedFlag  the value for zfgbb.thread.locked_flag
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setLockedFlag(Boolean lockedFlag) {
		this.lockedFlag = lockedFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.pinned_flag
	 * @return  the value of zfgbb.thread.pinned_flag
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public Boolean getPinnedFlag() {
		return pinnedFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.pinned_flag
	 * @param pinnedFlag  the value for zfgbb.thread.pinned_flag
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setPinnedFlag(Boolean pinnedFlag) {
		this.pinnedFlag = pinnedFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.created_ts
	 * @return  the value of zfgbb.thread.created_ts
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public LocalDateTime getCreatedTs() {
		return createdTs;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.created_ts
	 * @param createdTs  the value for zfgbb.thread.created_ts
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setCreatedTs(LocalDateTime createdTs) {
		this.createdTs = createdTs;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.updated_ts
	 * @return  the value of zfgbb.thread.updated_ts
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public LocalDateTime getUpdatedTs() {
		return updatedTs;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.updated_ts
	 * @param updatedTs  the value for zfgbb.thread.updated_ts
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setUpdatedTs(LocalDateTime updatedTs) {
		this.updatedTs = updatedTs;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.board_id
	 * @return  the value of zfgbb.thread.board_id
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public Integer getBoardId() {
		return boardId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.board_id
	 * @param boardId  the value for zfgbb.thread.board_id
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.created_user_id
	 * @return  the value of zfgbb.thread.created_user_id
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public Integer getCreatedUserId() {
		return createdUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.created_user_id
	 * @param createdUserId  the value for zfgbb.thread.created_user_id
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setCreatedUserId(Integer createdUserId) {
		this.createdUserId = createdUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.view_count
	 * @return  the value of zfgbb.thread.view_count
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public Integer getViewCount() {
		return viewCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.view_count
	 * @param viewCount  the value for zfgbb.thread.view_count
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column zfgbb.thread.migration_hash
	 * @return  the value of zfgbb.thread.migration_hash
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public String getMigrationHash() {
		return migrationHash;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column zfgbb.thread.migration_hash
	 * @param migrationHash  the value for zfgbb.thread.migration_hash
	 * @mbg.generated  Mon Feb 10 22:50:25 EST 2025
	 */
	public void setMigrationHash(String migrationHash) {
		this.migrationHash = migrationHash;
	}

	@Override
	public String computeHash() throws NoSuchAlgorithmException {
		return super.calculateHashInternal(threadId
										   + threadName
										   + lockedFlag.toString()
										   + pinnedFlag.toString()
										   + boardId
										   + createdUserId
										   + viewCount);
	}
}