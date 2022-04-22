package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.TestVo;

@Mapper
public interface Test {
	public ArrayList<TestVo> getList();
}
