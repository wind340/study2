package com.board.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.board.mappers.boardMapper";
	
	@Override
	public List list() throws Exception {
		return sql.selectList(namespace+".list");
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		return sql.selectOne(namespace+".read", bno);
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sql.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int bno) throws Exception {
		sql.delete(namespace + ".delete", bno);
	}

	@Override
	public int count() throws Exception {
		return sql.selectOne(namespace+".count");
	}

	@Override
	public List listPage(int displayPost, int postNum) throws Exception {

		 HashMap data = new HashMap();
		  
		 data.put("displayPost", displayPost);
		 data.put("postNum", postNum);
		  
		 return sql.selectList(namespace + ".listPage", data);
	}

}
