package com.example.demo.controller;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		//現在日付を取得
		long miliseconds = System.currentTimeMillis();
		Date nowDate = new Date(miliseconds);
		
		//Modelに登録
		model.addAttribute("mBBSList", mBBSList);
		model.addAttribute("nowDate", nowDate);
		
		
		//topLayout.htmlに遷移
		return "BBS/topLayout";	
	}
	
	/** 登録処理 */
	@PostMapping("/regist")
	public String postRegist(@RequestParam("new_no")int newNo, ModelBBS mBBS) {
		
		//登録用の新規番号を設定
		mBBS.setNo(newNo);
		
		//1件更新
		mapper.insertOne(mBBS.getNo(),mBBS.getDate(), mBBS.getName(), mBBS.getContents());
		
		//top.htmlにリダイレクト
		return "redirect:/BBS/topLayout";
		
	}

}
