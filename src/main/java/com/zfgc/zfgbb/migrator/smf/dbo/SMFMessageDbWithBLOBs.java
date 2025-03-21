package com.zfgc.zfgbb.migrator.smf.dbo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class SMFMessageDbWithBLOBs extends SMFMessageDb {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column smf_1messages.description
	 * @mbg.generated  Sun Feb 16 10:27:49 EST 2025
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column smf_1messages.body
	 * @mbg.generated  Sun Feb 16 10:27:49 EST 2025
	 */
	private String body;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column smf_1messages.description
	 * @return  the value of smf_1messages.description
	 * @mbg.generated  Sun Feb 16 10:27:49 EST 2025
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column smf_1messages.description
	 * @param description  the value for smf_1messages.description
	 * @mbg.generated  Sun Feb 16 10:27:49 EST 2025
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column smf_1messages.body
	 * @return  the value of smf_1messages.body
	 * @mbg.generated  Sun Feb 16 10:27:49 EST 2025
	 */
	public String getBody() {
		return body;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column smf_1messages.body
	 * @param body  the value for smf_1messages.body
	 * @mbg.generated  Sun Feb 16 10:27:49 EST 2025
	 */
	public void setBody(String body) {
		this.body = body;
	}
	
	public LocalDateTime getPostTimeAsTime() {
		Long ts = Long.parseLong(getPosterTime().toString() + "000");
		return LocalDateTime.ofInstant(Instant.ofEpochMilli(ts), ZoneOffset.UTC);
	}
	
	public LocalDateTime getUpdatedTimeAsTime() {
		if(this.getModifiedTime() == 0) {
			return null;
		}
		
		Long ts = Long.parseLong(this.getModifiedTime().toString() + "000");
		return LocalDateTime.ofInstant(Instant.ofEpochMilli(ts), ZoneOffset.UTC);
	}
}