package org.jwh.domain;

import java.util.Date;

public class contentVO {
	int cid;
	String title;
	String writer;
	String content;
	Date regdate;
	int hits;
	
	public contentVO(int cid, String title, String writer, String content, Date regdate, int hits) {
		super();
		this.cid = cid;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.hits = hits;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}
	
	
	
}
