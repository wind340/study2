package com.myboot.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myboot.domain.Notice;
import com.myboot.exception.NoticeException;

@Repository
public class MybatisNotice implements NoticeDAO {

	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public List selectAll() {
		return sessionTemplate.selectList("Notice.selectAll");
	}

	@Override
	public Notice select(int notice_id) {
		return sessionTemplate.selectOne("Notice.select");
	}

	@Override
	public void insert(Notice notice) throws NoticeException {
		int result = sessionTemplate.insert("Notice.insert");
		if(result==0) {
			throw new NoticeException("게시물 등록 실패");
		}
	}

	@Override
	public void update(Notice notice) throws NoticeException {
		int result = sessionTemplate.update("Notice.update");
		if(result==0) {
			throw new NoticeException("게시물 등록 실패");
		}
	}

	@Override
	public void delete(int notice_id) throws NoticeException {
		int result = sessionTemplate.delete("Notice.delete");
		if(result==0) {
			throw new NoticeException("게시물 등록 실패");
		}
	}

	
}
