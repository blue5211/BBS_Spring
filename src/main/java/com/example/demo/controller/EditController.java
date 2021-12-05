package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/BBS")
public class EditController {
	
	@PostMapping("/editLayout")
	public String postEdit() {
		//top.htmlに遷移
		return "BBS/topLayout";
	}

}
