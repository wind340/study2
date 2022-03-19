package com.board.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardDAO> list() throws Exception {
		return dao.list();
	}

	@Override
	public BoardVO read(int num) throws Exception {
		return dao.read(num);
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void delete(int num) throws Exception {
		dao.delete(num);
	}

}
