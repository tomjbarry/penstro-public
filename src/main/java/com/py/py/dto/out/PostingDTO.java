package com.py.py.dto.out;

import java.util.Date;
import java.util.List;

import com.py.py.dto.DTO;

public class PostingDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5851746510830922678L;
	private String id;
	private String content;
	private String preview;
	private UsernameDTO author;
	private UsernameDTO beneficiary;
	private String title;
	private TallyDTO tally;
	private List<String> tags;
	private Date created;
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
	private String imageLink;
	private Integer imageHeight;
	private Integer imageWidth;

	public PostingDTO() {
	}

	public void setAuthor(UsernameDTO author) {
		this.author = author;
	}

	public UsernameDTO getAuthor() {
		return author;
	}
	
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TallyDTO getTally() {
		return tally;
	}

	public void setTally(TallyDTO tally) {
		this.tally = tally;
	}

	public long getAppreciationCount() {
		return appreciationCount;
	}

	public void setAppreciationCount(long appreciationCount) {
		this.appreciationCount = appreciationCount;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
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

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Integer getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(Integer imageHeight) {
		this.imageHeight = imageHeight;
	}

	public Integer getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(Integer imageWidth) {
		this.imageWidth = imageWidth;
	}
	
}
