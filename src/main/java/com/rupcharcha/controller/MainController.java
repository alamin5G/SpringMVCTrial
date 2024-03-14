package com.rupcharcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/home-page")
	public String homePage() {
		
		return "home";
	}
	
	@RequestMapping("/login-page")
	public String loginPage() {
		
		return "login";
	}
}
