package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class SaveLocationDTO extends DTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6590144262428850862L;
	private String name;
	
	public SaveLocationDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
