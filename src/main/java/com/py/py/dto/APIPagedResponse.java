package com.py.py.dto;

import org.springframework.data.domain.Page;

import com.py.py.constants.ResponseCodes;

public class APIPagedResponse<T extends DTO, P extends DTO> extends APIResponse<T> {

	protected Page<P> page = null;
	
	public APIPagedResponse() {
	}
	
	public APIPagedResponse(T dto) {
		this.dto = dto;
		this.code = ResponseCodes.SUCCESS;
	}
	
	public APIPagedResponse(T dto, Page<P> page) {
		this.dto = dto;
		this.page = page;
		this.code = ResponseCodes.SUCCESS;
	}
	
	public APIPagedResponse(Page<P> page) {
		this.page = page;
		this.code = ResponseCodes.SUCCESS;
	}
	
	public APIPagedResponse(int code) {
		this.code = code;
	}

	public Page<P> getPage() {
		return page;
	}

	public void setPage(Page<P> page) {
		this.page = page;
	}
}
