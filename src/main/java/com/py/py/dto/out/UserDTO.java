package com.py.py.dto.out;

import com.py.py.dto.DTO;

public class UserDTO extends DTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6327219624730255673L;
	private UsernameDTO username;
	private long replyCount;
	private TallyDTO replyTally;
	private TallyDTO contributionTally;
	private long contributedPostings;
	private long contributedComments;
	private long contributedAppreciationCount;
	private long appreciation;
	private long appreciationCount;
	private long promotion;
	private long promotionCount;
	private long followerCount;
	private long followeeCount;
	private boolean canComment;
	private String description;
	private boolean warning;
	private String appreciationResponse;
	private boolean appreciationResponseWarning;
	private boolean removed;
	private String language;
	//private List<UsernameDTO> appreciationTargets;
	
	public UserDTO() {
	}

	public UsernameDTO getUsername() {
		return username;
	}

	public void setUsername(UsernameDTO username) {
		this.username = username;
	}

	public TallyDTO getContributionTally() {
		return contributionTally;
	}

	public void setContributionTally(TallyDTO contributionTally) {
		this.contributionTally = contributionTally;
	}

	public long getContributedPostings() {
		return contributedPostings;
	}

	public void setContributedPostings(long contributedPostings) {
		this.contributedPostings = contributedPostings;
	}

	public long getContributedComments() {
		return contributedComments;
	}

	public void setContributedComments(long contributedComments) {
		this.contributedComments = contributedComments;
	}

	public long getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(long appreciation) {
		this.appreciation = appreciation;
	}

	public long getAppreciationCount() {
		return appreciationCount;
	}

	public void setAppreciationCount(long appreciationCount) {
		this.appreciationCount = appreciationCount;
	}

	public long getFollowerCount() {
		return followerCount;
	}

	public void setFollowerCount(long followerCount) {
		this.followerCount = followerCount;
	}

	public long getFolloweeCount() {
		return followeeCount;
	}

	public void setFolloweeCount(long followeeCount) {
		this.followeeCount = followeeCount;
	}

	public boolean isCanComment() {
		return canComment;
	}

	public void setCanComment(boolean canComment) {
		this.canComment = canComment;
	}

	public long getContributedAppreciationCount() {
		return contributedAppreciationCount;
	}

	public void setContributedAppreciationCount(long contributedAppreciationCount) {
		this.contributedAppreciationCount = contributedAppreciationCount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public long getPromotion() {
		return promotion;
	}

	public void setPromotion(long promotion) {
		this.promotion = promotion;
	}

	public long getPromotionCount() {
		return promotionCount;
	}

	public void setPromotionCount(long promotionCount) {
		this.promotionCount = promotionCount;
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

	public boolean isRemoved() {
		return removed;
	}

	public void setRemoved(boolean removed) {
		this.removed = removed;
	}

	public String getAppreciationResponse() {
		return appreciationResponse;
	}

	public void setAppreciationResponse(String appreciationResponse) {
		this.appreciationResponse = appreciationResponse;
	}

	public boolean isAppreciationResponseWarning() {
		return appreciationResponseWarning;
	}

	public void setAppreciationResponseWarning(boolean appreciationResponseWarning) {
		this.appreciationResponseWarning = appreciationResponseWarning;
	}
}
