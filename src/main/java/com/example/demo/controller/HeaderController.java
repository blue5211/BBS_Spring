package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mapper.MapperBBS;
import com.example.demo.model.ModelBBS;

@Controller
@RequestMapping("/BBS")
public class HeaderController {
	
	@Autowired
	private MapperBBS mapper;
	
	@PostMapping(value = "/Header", params = "delete")
	public String postDeleteHeader(@RequestParam("disp_no")int no, Model model) {
		//ユーザー1件取得処理
		ModelBBS mBBS = mapper.findOne(no);
		
		//Modelに登録
		model.addAttribute("mBBS", mBBS);
		
		//deleteLayout.htmlに遷移
		return "BBS/deleteLayout";
	}
	
	@PostMapping(value = "/Header", params = "edit")
	public String postEditHeader(@RequestParam("disp_no")int no, Model model) {
		//ユーザー1件取得処理
		ModelBBS mBBS = mapper.findOne(no);

		//Modelに登録
		model.addAttribute("mBBS", mBBS);
		
		//editLayout.htmlに遷移
		return "BBS/editLayout";
	}

}
