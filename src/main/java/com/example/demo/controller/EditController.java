package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.MapperBBS;
import com.example.demo.model.ModelBBS;

@Controller
@RequestMapping("/BBS")
public class EditController {
	
	@Autowired
	private MapperBBS mapper;
	
	@PostMapping("/editLayout")
	public String postEdit(ModelBBS mBBS) {
		
		//1件更新
		mapper.updateOne(mBBS.getNo(), mBBS.getName(), mBBS.getContents());
		
		//top.htmlにリダイレクト
		return "redirect:/BBS/topLayout";
	}

}
