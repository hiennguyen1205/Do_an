package com.dooan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhanQuyen {
	@GetMapping("/login")
	public String login() {
		
		
		return "login";
	}
}
