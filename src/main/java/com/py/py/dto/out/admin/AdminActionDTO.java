package com.py.py.dto.out.admin;

import java.util.Date;

import com.py.py.dto.DTO;
import com.py.py.enumeration.ADMIN_STATE;
import com.py.py.enumeration.ADMIN_TYPE;

public class AdminActionDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6755853617469264382L;
	private ADMIN_TYPE type = ADMIN_TYPE.UNDEFINED;
	private ADMIN_STATE state = ADMIN_STATE.INITIAL;
	private String target = null;
	private DTO dto = null;
	private Date created = new Date();
	private Date lastModified = new Date();
	
	public AdminActionDTO() {
	}

	public ADMIN_TYPE getType() {
		return type;
	}

	public void setType(ADMIN_TYPE type) {
		this.type = type;
	}

	public ADMIN_STATE getState() {
		return state;
	}

	public void setState(ADMIN_STATE state) {
		this.state = state;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public DTO getDto() {
		return dto;
	}

	public void setDto(DTO dto) {
		this.dto = dto;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	
	
}
