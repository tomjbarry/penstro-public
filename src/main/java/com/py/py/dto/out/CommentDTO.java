package com.py.py.dto.out;

import java.util.Date;

import com.py.py.dto.DTO;
import com.py.py.enumeration.COMMENT_TYPE;

public class CommentDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5749299715206815928L;
	private String id;
	private String base;
	private COMMENT_TYPE type;
	private String content;
	private UsernameDTO author;
	private UsernameDTO beneficiary;
	private TallyDTO tally;
	private Date created;
	private String parent;
	private long replyCount;
	private long appreciationCount;
	private long promotionCount;
	private TallyDTO replyTally;
	private boolean warning;
	private boolean flagged;
	private boolean removed = false;
	private boolean disabled = false;
	private boolean archived = false;
	private boolean canAppreciate;
	private boolean canComment;
	private String language;
	
	public CommentDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public UsernameDTO getAuthor() {
		return author;
	}

	public void setAuthor(UsernameDTO author) {
		this.author = author;
	}

	public TallyDTO getTally() {
		return tally;
	}

	public void setTally(TallyDTO tally) {
		this.tally = tally;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
	
	public long getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(long replyCount) {
		this.replyCount = replyCount;
	}

	public long getAppreciationCount() {
		return appreciationCount;
	}

	public void setAppreciationCount(long appreciationCount) {
		this.appreciationCount = appreciationCount;
	}

	public TallyDTO getReplyTally() {
		return replyTally;
	}

	public void setReplyTally(TallyDTO replyTally) {
		this.replyTally = replyTally;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public COMMENT_TYPE getType() {
		return type;
	}

	public void setType(COMMENT_TYPE type) {
		this.type = type;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public boolean isRemoved() {
		return removed;
	}

	public void setRemoved(boolean removed) {
		this.removed = removed;
	}

	public boolean isCanAppreciate() {
		return canAppreciate;
	}

	public void setCanAppreciate(boolean canAppreciate) {
		this.canAppreciate = canAppreciate;
	}

	public boolean isCanComment() {
		return canComment;
	}

	public void setCanComment(boolean canComment) {
		this.canComment = canComment;
	}

	public boolean isFlagged() {
		return flagged;
	}

	public void setFlagged(boolean flagged) {
		this.flagged = flagged;
	}

	public long getPromotionCount() {
		return promotionCount;
	}

	public void setPromotionCount(long promotionCount) {
		this.promotionCount = promotionCount;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public UsernameDTO getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(UsernameDTO beneficiary) {
		this.beneficiary = beneficiary;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}
}
