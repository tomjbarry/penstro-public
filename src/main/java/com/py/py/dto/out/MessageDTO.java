package com.py.py.dto.out;

import java.util.Date;

import com.py.py.dto.DTO;

public class MessageDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1240093694897586526L;
	private UsernameDTO author;
	private UsernameDTO target;
	private String message;
	private Date created;
	private boolean read;
	
	public MessageDTO() {
	}

	public UsernameDTO getAuthor() {
		return author;
	}

	public void setAuthor(UsernameDTO author) {
		this.author = author;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public UsernameDTO getTarget() {
		return target;
	}

	public void setTarget(UsernameDTO target) {
		this.target = target;
	}

	public boolean isRead() {
	return read;
	}

	public void setRead(boolean read) {
	this.read = read;
	}
	
}
