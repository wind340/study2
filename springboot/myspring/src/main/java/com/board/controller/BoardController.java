package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
}
