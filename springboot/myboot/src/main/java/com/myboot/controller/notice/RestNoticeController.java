package com.myboot.controller.notice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myboot.domain.Notice;

@RestController
public class RestNoticeController {
	
	@GetMapping("/rest/notice")
	public Notice getList() {
		System.out.println("getList 호출");
		
		Notice notice = new Notice();
		notice.setNotice_id(1);
		notice.setTitle("과연될까");
		notice.setWriter("배트맨");
		notice.setContent("내용");
		notice.setRegdate("2022-01-06");
		notice.setHit(5);
		
		return notice;
	}
}
