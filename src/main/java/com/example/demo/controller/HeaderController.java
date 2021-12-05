package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/BBS")
public class HeaderController {
	
	@PostMapping("/deleteHeader")
	public String postDeleteHeader() {
		//deleteLayout.htmlに遷移
		return "BBS/deleteLayout";
	}
	
	@PostMapping("/editHeader")
	public String postEditHeader() {
		//editLayout.htmlに遷移
		return "BBS/editLayout";
	}

}
