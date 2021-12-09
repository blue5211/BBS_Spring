package com.example.demo.model;

import java.sql.Date;

import lombok.Data;

@Data
public class ModelBBS {
	private int no;
	private Date date;
	private String name;
	private String contents;
}
