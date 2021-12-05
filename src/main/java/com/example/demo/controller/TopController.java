package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/BBS")
public class TopController {
	
	@PostMapping("/BBS/topLayout")
	public String postTop() {
		//top.htmlに遷移
		return "BBS/topLayout";
	}

}
