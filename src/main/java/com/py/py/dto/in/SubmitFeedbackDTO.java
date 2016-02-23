package com.py.py.dto.in;

import com.py.py.dto.DTO;
import com.py.py.enumeration.FEEDBACK_CONTEXT;
import com.py.py.enumeration.FEEDBACK_TYPE;

public class SubmitFeedbackDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6096589821680785870L;
	private FEEDBACK_CONTEXT context = FEEDBACK_CONTEXT.GENERAL;
	private FEEDBACK_TYPE type = FEEDBACK_TYPE.SUGGESTION;
	private String summary;

	public SubmitFeedbackDTO() {
	}

	public FEEDBACK_CONTEXT getContext() {
		return context;
	}

	public void setContext(FEEDBACK_CONTEXT context) {
		this.context = context;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public FEEDBACK_TYPE getType() {
		return type;
	}

	public void setType(FEEDBACK_TYPE type) {
		this.type = type;
	}
	
	
}
