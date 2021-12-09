package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mapper.MapperBBS;
import com.example.demo.model.ModelBBS;

@Controller
public class IndexController {

	@Autowired
	private MapperBBS mapper;
	
	@GetMapping("/index")
	public String getIndex() {
		//index.htmlに遷移
		return "index";
	}
	
	/** インデックス画面→トップ画面への遷移用 */
	@PostMapping("/BBS/topLayout")
	public String postIndex(Model model) {
		//あとで認証の設定をしましょう。。。
		
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

}
