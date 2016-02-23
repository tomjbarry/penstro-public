package com.py.py.dto.out;

import com.py.py.dto.DTO;

public class UsernameDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5280315916441728059L;
	private String username;
	private boolean exists;
	
	public UsernameDTO() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isExists() {
		return exists;
	}

	public void setExists(boolean exists) {
		this.exists = exists;
	}
}
