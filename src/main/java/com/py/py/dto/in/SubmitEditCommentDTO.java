package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class SubmitEditCommentDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4519436184744661593L;
	private String content;
	
	public SubmitEditCommentDTO() {
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
