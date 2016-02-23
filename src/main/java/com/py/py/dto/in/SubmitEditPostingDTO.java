package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class SubmitEditPostingDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -336641184763431971L;
	private String title;
	private String content;
	private String preview;
	
	private String imageLink;
	private Integer imageWidth;
	private Integer imageHeight;
	
	public SubmitEditPostingDTO() {
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
