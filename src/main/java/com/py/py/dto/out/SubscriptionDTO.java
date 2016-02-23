package com.py.py.dto.out;

import java.util.ArrayList;
import java.util.List;

import com.py.py.dto.DTO;

public class SubscriptionDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7170866010478887149L;

	private List<FollowDTO> follows = new ArrayList<FollowDTO>();
	private List<FollowDTO> blocked = new ArrayList<FollowDTO>();
	
	public SubscriptionDTO() {
	}
	
	public List<FollowDTO> getFollows() {
		return follows;
	}
	public void setFollows(List<FollowDTO> follows) {
		this.follows = follows;
	}
	public List<FollowDTO> getBlocked() {
		return blocked;
	}
	public void setBlocked(List<FollowDTO> blocked) {
		this.blocked = blocked;
	}
	
}
