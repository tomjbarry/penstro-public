package com.py.py.dto.in.admin;

import com.py.py.dto.DTO;
import com.py.py.enumeration.RESTRICTED_TYPE;

public class ChangeRestrictedDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2489097761374042312L;
	private String word;
	private RESTRICTED_TYPE type;
	
	public ChangeRestrictedDTO() {
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
}
