package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
public class BoardController {
	
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board/list")
	public String boardList (Model model) throws Exception {
		List boardList=boardService.list();
		model.addAttribute("boardList", boardList);
		return "/board/list";
	}
	
	@GetMapping("/board/write")
	public void getWrite () throws Exception {
	}
	
	@PostMapping("/board/write")
	public String write(BoardVO vo) throws Exception {
		boardService.write(vo);
		return "redirect:/board/list";
	}

	@GetMapping("/board/detail")
	public void boardDetail (int bno, Model model) throws Exception{
		BoardVO vo =boardService.read(bno);
		model.addAttribute("read", vo);
	}
	
	@GetMapping("/board/modify")
	public String boardModify(BoardVO vo) throws Exception{
		boardService.update(vo);
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/delete")
	public String boardDelete(@RequestParam int bno) throws Exception{
		boardService.delete(bno);
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/listPage")
	public void getListPage(Model model, @RequestParam int bno) throws Exception{
		int count = boardService.count();
		int postNum = 10;
		int pageNum = (int)Math.ceil((double)count/postNum);
		int displayPost = (bno - 1) * postNum;
		System.out.println("displayPost="+displayPost);
		System.out.println("postNum="+postNum);
		System.out.println("bno="+bno);
		System.out.println("count="+count);
		
		List<BoardVO> list = boardService.listPage(displayPost, postNum);
		model.addAttribute("list", list);
		model.addAttribute("pageNum", pageNum);
	}
}
