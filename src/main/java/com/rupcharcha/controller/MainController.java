package com.rupcharcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rupcharcha.entity.User;

@Controller
public class MainController {

	@RequestMapping("/home-page")
	public String homePage() {
		
		return "home";
	}
	
	@RequestMapping("/registration-page")
	public String registration() {
		return "registration";
	}
	
	@RequestMapping("/login-page")
	public String loginPage() {
		
		return "login";
	}
	
	@RequestMapping(path = "/createUser", method= RequestMethod.POST)
	public String registerUser(@ModelAttribute User user) {
		System.out.println("User registration method called");
		
		
		System.out.println(user);
		
		return  "registration";
	}
}
