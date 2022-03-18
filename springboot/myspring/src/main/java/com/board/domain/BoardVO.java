package com.board.domain;
/*
 * SQL> create table myBoard (
  2      bno       number            not null,
  3      title     varchar2(30)      not null,
  4      content   varchar2(2000)    not null,
  5      writer    varchar2(30)      not null,
  6      regDate   date              default sysdate,
  7      viewCnt   number            default 0,
  8      primary key(bno)
  9  );
 * */

import java.util.Date;

public class BoardVO {

	int bno;
	String title;
	String content;
	String wirter;
	Date date;
	int viewCnt;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWirter() {
		return wirter;
	}
	public void setWirter(String wirter) {
		this.wirter = wirter;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

		
}
