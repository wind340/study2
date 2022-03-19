package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.board.mappers.board";
	
	@Override
	public List list() throws Exception {
		return sql.selectList(namespace+".list");
	}

	@Override
	public BoardVO read(int num) throws Exception {
		return sql.selectOne(namespace+".read", num);
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + "write", vo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sql.update(namespace + "update", vo);
	}

	@Override
	public void delete(int num) throws Exception {
		sql.delete(namespace + "delete", num);
	}

}
