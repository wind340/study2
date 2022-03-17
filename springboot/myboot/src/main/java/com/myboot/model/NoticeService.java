package com.myboot.model;

import java.util.List;

import com.myboot.domain.Notice;

public interface NoticeService {

	public List selectAll();
	public Notice select(int notice_id);
	public void insert(Notice notice);
	public void update(Notice notice);
	public void delete(int notice_id);
	
}
