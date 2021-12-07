package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.ModelBBS;

@Mapper
public interface MapperBBS {
	
	/** ユーザー全件取得 */
	public List<ModelBBS> findAll();

}
