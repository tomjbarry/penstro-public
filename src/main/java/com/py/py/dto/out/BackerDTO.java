package com.py.py.dto.out;

import com.py.py.dto.DTO;

public class BackerDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5024712474902321946L;
	private UsernameDTO source;
	private UsernameDTO target;
	private long value;
	private boolean email = false;
	
	public BackerDTO() {
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public UsernameDTO getSource() {
		return source;
	}

	public void setSource(UsernameDTO source) {
		this.source = source;
	}

	public UsernameDTO getTarget() {
		return target;
	}

	public void setTarget(UsernameDTO target) {
		this.target = target;
	}

	public boolean isEmail() {
		return email;
	}

	public void setEmail(boolean email) {
		this.email = email;
	}
	
}
