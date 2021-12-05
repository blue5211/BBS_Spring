package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	
	
	@GetMapping("/index")
	public String getIndex() {
		//index.htmlに遷移
		return "index";
	}
	
	@PostMapping("/BBS/topLayout")
	public String postIndex() {
		//top.htmlに遷移
		//あとで認可の設定をしましょう。。。
		return "BBS/topLayout";
	}

}
