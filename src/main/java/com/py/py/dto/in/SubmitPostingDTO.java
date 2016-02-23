package com.py.py.dto.in;

import java.util.List;

import com.py.py.dto.DTO;

public class SubmitPostingDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6852454766593736439L;
	private String content;
	private String preview;
	private String title;
	private String backer;
	private List<String> tags;
	private long cost;
	private boolean warning;
	
	private String imageLink;
	private Integer imageWidth;
	private Integer imageHeight;
	
	public SubmitPostingDTO() {
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

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getBacker() {
		return backer;
	}

	public void setBacker(String backer) {
		this.backer = backer;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Integer getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(Integer imageWidth) {
		this.imageWidth = imageWidth;
	}

	public Integer getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(Integer imageHeight) {
		this.imageHeight = imageHeight;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

}
