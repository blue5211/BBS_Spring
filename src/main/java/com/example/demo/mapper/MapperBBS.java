package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.ModelBBS;

@Mapper
public interface MapperBBS {
	
	/** 全件取得 */
	public List<ModelBBS> findAll();
	
	/** 1件取得 */
	public ModelBBS findOne(int no);

}
