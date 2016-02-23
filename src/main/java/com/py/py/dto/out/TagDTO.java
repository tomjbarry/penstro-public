package com.py.py.dto.out;

import java.util.Date;

import com.py.py.dto.DTO;

public class TagDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5228481073513969733L;
	private String name;
	private String language;
	private long value;
	private long appreciation;
	private Date lastPromotion;
	private long replyCount;
	private TallyDTO replyTally;
	private boolean canPromote;
	private boolean canComment;
	private boolean locked;
	
	public TagDTO() {
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public Date getLastPromotion() {
		return lastPromotion;
	}

	public void setLastPromotion(Date lastPromotion) {
		this.lastPromotion = lastPromotion;
	}

	public boolean isCanPromote() {
		return canPromote;
	}

	public void setCanPromote(boolean canPromote) {
		this.canPromote = canPromote;
	}

	public boolean isCanComment() {
		return canComment;
	}

	public void setCanComment(boolean canComment) {
		this.canComment = canComment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public long getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(long replyCount) {
		this.replyCount = replyCount;
	}

	public TallyDTO getReplyTally() {
		return replyTally;
	}

	public void setReplyTally(TallyDTO replyTally) {
		this.replyTally = replyTally;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public long getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(long appreciation) {
		this.appreciation = appreciation;
	}
	
}
