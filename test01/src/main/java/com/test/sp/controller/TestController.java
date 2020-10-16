package com.test.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.test.sp.vo.TestVO;

@Controller
public class TestController {
	
	
	@GetMapping("/test")
	public String goUpload() {
		return "upload";
	}
	@PostMapping("/test")
	public String doUpload(@ModelAttribute TestVO test, Model model) {
		model.addAttribute("test", test);
		return "complete";
	}
}
