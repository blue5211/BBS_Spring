package com.example.demo.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.ModelBBS;

@Mapper
public interface MapperBBS {
	
	/** 全件取得 */
	public List<ModelBBS> findAll();
	
	/** 1件取得 */
	public ModelBBS findOne(int no);

	/** 1件更新 */
	public void updateOne(@Param("no")int no, @Param("name")String name, @Param("contents")String contents);
	
	/** 1件削除 */
	public int deleteOne(@Param("no")int no);
	
	/** 1件登録 */
	public void insertOne(@Param("no")int no, @Param("date")Date date, @Param("name")String name,
			@Param("contents")String contents);
}
