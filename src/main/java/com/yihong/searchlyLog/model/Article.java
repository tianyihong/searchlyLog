package com.yihong.searchlyLog.model;

import io.searchbox.annotations.JestId;

public class Article {
	@JestId
	private Long id;

	private String author;
	private String content;

	public Long getId() {
	   return id;
	}

	public void setId(Long id) {
	   this.id = id;
	}

	public String getAuthor() {
	    return author;
	}

	public void setAuthor(String author) {
	    this.author = author;
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
	}
}
