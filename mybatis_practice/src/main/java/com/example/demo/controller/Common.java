
package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;
import com.example.demo.vo.TestVo;

@Controller
public class Common {

	@Autowired
	TestService ts;

	@GetMapping("/test")
	public String index(Model model) {
		ArrayList<TestVo> tv = ts.getList();
		
		for (TestVo v : tv) {
			System.out.println(v.getRegion());
			System.out.println(v.getSrc());
		}
		model.addAttribute("tv",tv);
		return "index.html";
	}
	
	@GetMapping("/album")
	public String second() {
		return "index.html";
	}
	
	@PostMapping("/addAlbum")
	public String addAlbum() {
		return "index.html";
	}
}
