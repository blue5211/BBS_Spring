package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/BBS")
public class DeleteController {
	
	@PostMapping("/deleteLayout")
	public String postDelete() {
		//deleteLayout.htmlに遷移
		return "BBS/topLayout";
	}

}
