package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.MapperBBS;
import com.example.demo.model.ModelBBS;

@Controller
@RequestMapping("/BBS")
public class TopController {
	
	@Autowired
	private MapperBBS mapper;
	
	/** トップ画面への再遷移用 */
	@GetMapping("/topLayout")
	public String getTop(Model model) {
		
		//ユーザー全件取得処理
		List<ModelBBS> mBBSList = mapper.findAll();
		
		//Modelに登録
		model.addAttribute("mBBSList", mBBSList);
		
		//topLayout.htmlに遷移
		return "BBS/topLayout";	
	}

}
