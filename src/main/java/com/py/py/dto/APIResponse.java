package com.py.py.dto;

import com.py.py.constants.ResponseCodes;

public class APIResponse<T extends DTO> {

	protected int code = ResponseCodes.FAILURE;
	protected T dto;
	
	public APIResponse() {
		code = ResponseCodes.FAILURE;
	}

	public APIResponse(T dto) {
		this.dto = dto;
		code = ResponseCodes.SUCCESS;
	}
	
	public APIResponse(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getDto() {
		return dto;
	}

	public void setDto(T dto) {
		this.dto = dto;
	}
}
