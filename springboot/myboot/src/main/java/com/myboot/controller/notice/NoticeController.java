package com.myboot.controller.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myboot.model.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/notice/list")
	public String getList(Model model){
		List noticeList = noticeService.selectAll();
		model.addAttribute(noticeList);
		
		return "notice/list";
	}
}
