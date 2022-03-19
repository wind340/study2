package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
public class BoardController {
	
	
	@Inject
	BoardService boardService;
	
	@GetMapping("/board/list")
	public void boardList (Model model) throws Exception {
		List boardList=boardService.list();
		model.addAttribute("boardList", boardList);
	}
	
	@GetMapping("/board/write")
	public void getWrite () throws Exception {
	}
	
	@PostMapping("/board/write")
	public String postBoard (BoardVO vo)throws Exception{
		boardService.write(vo);
		return "redirect:/";
	}
	
	@GetMapping("/board/detail")
	public void boardDetail (int num, Model model) throws Exception{
		BoardVO vo =boardService.read(num);
		model.addAttribute("read", vo);
	}
	
}
