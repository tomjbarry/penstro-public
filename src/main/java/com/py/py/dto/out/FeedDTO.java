package com.py.py.dto.out;

import java.util.Date;
import java.util.Map;

import com.py.py.dto.DTO;
import com.py.py.enumeration.EVENT_TYPE;

public class FeedDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8454584833141440865L;
	private UsernameDTO author;
	private Map<String, String> targetIds;
	private Map<String, String> targets;
	private Date occurred;
	private EVENT_TYPE type;
	
	public FeedDTO() {
	}

	public UsernameDTO getAuthor() {
		return author;
	}

	public void setAuthor(UsernameDTO author) {
		this.author = author;
	}

	public Date getOccurred() {
		return occurred;
	}

	public void setOccurred(Date occurred) {
		this.occurred = occurred;
	}

	public EVENT_TYPE getType() {
		return type;
	}

	public void setType(EVENT_TYPE type) {
		this.type = type;
	}

	public Map<String, String> getTargetIds() {
		return targetIds;
	}

	public void setTargetIds(Map<String, String> targetIds) {
		this.targetIds = targetIds;
	}

	public Map<String, String> getTargets() {
		return targets;
	}

	public void setTargets(Map<String, String> targets) {
		this.targets = targets;
	}
}
