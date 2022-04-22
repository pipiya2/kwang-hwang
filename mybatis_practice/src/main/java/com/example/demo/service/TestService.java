package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.Test;
import com.example.demo.vo.TestVo;

@Service
public class TestService {
	
	@Autowired
	Test testMapper;
	
	public ArrayList<TestVo> getList(){
		return testMapper.getList();
	}
}
