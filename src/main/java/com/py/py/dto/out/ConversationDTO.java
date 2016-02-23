package com.py.py.dto.out;

import java.util.Date;

import com.py.py.dto.DTO;

public class ConversationDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5205256277567612230L;
	private UsernameDTO author;
	private UsernameDTO target;
	private Date lastMessage;
	private Date created;
	private String preview;
	
	public ConversationDTO() {
	}
	
	public UsernameDTO getAuthor() {
		return author;
	}
	public void setAuthor(UsernameDTO author) {
		this.author = author;
	}
	public UsernameDTO getTarget() {
		return target;
	}
	public void setTarget(UsernameDTO target) {
		this.target = target;
	}
	public Date getLastMessage() {
		return lastMessage;
	}
	public void setLastMessage(Date lastMessage) {
		this.lastMessage = lastMessage;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}
	
	
}
