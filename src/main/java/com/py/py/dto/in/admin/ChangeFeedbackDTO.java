package com.py.py.dto.in.admin;

import java.util.List;

import com.py.py.dto.DTO;
import com.py.py.enumeration.FEEDBACK_CONTEXT;
import com.py.py.enumeration.FEEDBACK_STATE;
import com.py.py.enumeration.FEEDBACK_TYPE;

public class ChangeFeedbackDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8193583686756063757L;
	private List<String> ids;
	private FEEDBACK_TYPE type;
	private FEEDBACK_STATE state;
	private FEEDBACK_CONTEXT context;
	private String summary;
	
	public ChangeFeedbackDTO() {
	}

	public FEEDBACK_TYPE getType() {
		return type;
	}

	public void setType(FEEDBACK_TYPE type) {
		this.type = type;
	}

	public FEEDBACK_STATE getState() {
		return state;
	}

	public void setState(FEEDBACK_STATE state) {
		this.state = state;
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

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}
	
	
}
