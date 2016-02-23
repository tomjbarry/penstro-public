package com.py.py.dto.out.admin;

import java.util.Date;

import com.py.py.dto.DTO;
import com.py.py.dto.out.UsernameDTO;
import com.py.py.enumeration.FEEDBACK_CONTEXT;
import com.py.py.enumeration.FEEDBACK_STATE;
import com.py.py.enumeration.FEEDBACK_TYPE;

public class FeedbackDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3178829716404247245L;
	private String id;
	private FEEDBACK_TYPE type = FEEDBACK_TYPE.BUG;
	private FEEDBACK_STATE state = FEEDBACK_STATE.INITIAL;
	private FEEDBACK_CONTEXT context = FEEDBACK_CONTEXT.GENERAL;
	private String summary;
	private UsernameDTO username;
	private Date created = new Date();
	private Date lastModified = new Date();
	
	public FeedbackDTO() {
	}

	public FEEDBACK_TYPE getType() {
		return type;
	}

	public void setType(FEEDBACK_TYPE type) {
		this.type = type;
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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UsernameDTO getUsername() {
		return username;
	}

	public void setUsername(UsernameDTO username) {
		this.username = username;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public FEEDBACK_STATE getState() {
		return state;
	}

	public void setState(FEEDBACK_STATE state) {
		this.state = state;
	}
}
