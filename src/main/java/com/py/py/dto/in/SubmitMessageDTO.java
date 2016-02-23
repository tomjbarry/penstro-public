package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class SubmitMessageDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7474746101112271197L;
	private String message = null;
	
	public SubmitMessageDTO() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
