package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {

	public List list() throws Exception;
	
	public BoardVO read(int num) throws Exception;
	
	public void write(BoardVO vo) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int num) throws Exception;

	
}
