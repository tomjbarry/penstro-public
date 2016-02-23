package com.py.py.dto.out.admin;

import java.util.Date;

import com.py.py.dto.DTO;
import com.py.py.enumeration.RESTRICTED_TYPE;

public class RestrictedDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5666874025008991193L;
	private String word;
	private RESTRICTED_TYPE type;
	private Date created;
	
	public RestrictedDTO() {
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public RESTRICTED_TYPE getType() {
		return type;
	}

	public void setType(RESTRICTED_TYPE type) {
		this.type = type;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
