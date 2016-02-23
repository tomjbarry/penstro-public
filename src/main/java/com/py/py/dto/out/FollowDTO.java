package com.py.py.dto.out;

import java.util.Date;

import com.py.py.dto.DTO;

public class FollowDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8149529389635281541L;
	private UsernameDTO username;
	private Date added;
	
	public FollowDTO() {
	}

	public UsernameDTO getUsername() {
		return username;
	}

	public void setUsername(UsernameDTO username) {
		this.username = username;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}
	
	
}
