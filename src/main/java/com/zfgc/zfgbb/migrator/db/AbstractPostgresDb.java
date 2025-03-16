package com.zfgc.zfgbb.migrator.db;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public abstract class AbstractPostgresDb {
	public abstract String computeHash() throws NoSuchAlgorithmException;
	
	protected String calculateHashInternal(String sequence) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
	    byte[] bytes = messageDigest.digest(sequence.getBytes());
	    return Base64.getUrlEncoder().encodeToString(bytes);
	}
}