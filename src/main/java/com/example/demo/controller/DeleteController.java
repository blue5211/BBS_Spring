package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.MapperBBS;
import com.example.demo.model.ModelBBS;

@Controller
@RequestMapping("/BBS")
public class DeleteController {
	
	@Autowired
	private MapperBBS mapper;
	
	@PostMapping("/deleteLayout")
	public String postDelete(ModelBBS mBBS) {

		//1件削除
		mapper.deleteOne(mBBS.getNo());
		
		//top.htmlにリダイレクト
		return "redirect:/BBS/topLayout";
	}

}
