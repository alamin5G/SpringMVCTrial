package com.rupcharcha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rupcharcha.entity.User;
import com.rupcharcha.service.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService userService;
	
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
	public String registerUser(@ModelAttribute User user, @RequestParam("name") String nm, Model model) {
		System.out.println("User registration method called");
		
		userService.registerUser(user);
		model.addAttribute("msg", "Registration success!");
		
		return  "registration";
	}
}
