package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class LoginRequestDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7216808187699707691L;
	protected String username = null;
	protected String password = null;
	protected Boolean rememberMe = null;
	
	public LoginRequestDTO() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	
	
}
