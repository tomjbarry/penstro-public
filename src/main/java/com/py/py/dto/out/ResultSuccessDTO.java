package com.py.py.dto.out;

import com.py.py.dto.DTO;

public class ResultSuccessDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4929663160954734794L;
	private String result = null;
	
	public ResultSuccessDTO() {
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
