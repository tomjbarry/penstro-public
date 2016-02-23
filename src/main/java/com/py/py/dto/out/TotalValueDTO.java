package com.py.py.dto.out;

import java.math.BigInteger;
import java.util.Map;

import com.py.py.dto.DTO;
import com.py.py.enumeration.TIME_OPTION;

public class TotalValueDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1062319262507924538L;
	private Map<TIME_OPTION, BigInteger> postings;
	private Map<TIME_OPTION, BigInteger> comments;
	private Map<TIME_OPTION, BigInteger> users;
	private Map<TIME_OPTION, BigInteger> tags;
	private Map<TIME_OPTION, BigInteger> all;
	
	public Map<TIME_OPTION, BigInteger> getPostings() {
		return postings;
	}

	public void setPostings(Map<TIME_OPTION, BigInteger> postings) {
		this.postings = postings;
	}

	public Map<TIME_OPTION, BigInteger> getComments() {
		return comments;
	}

	public void setComments(Map<TIME_OPTION, BigInteger> comments) {
		this.comments = comments;
	}

	public Map<TIME_OPTION, BigInteger> getUsers() {
		return users;
	}

	public void setUsers(Map<TIME_OPTION, BigInteger> users) {
		this.users = users;
	}

	public Map<TIME_OPTION, BigInteger> getTags() {
		return tags;
	}

	public void setTags(Map<TIME_OPTION, BigInteger> tags) {
		this.tags = tags;
	}

	public TotalValueDTO() {
	}

	public Map<TIME_OPTION, BigInteger> getAll() {
		return all;
	}

	public void setAll(Map<TIME_OPTION, BigInteger> all) {
		this.all = all;
	}
}
