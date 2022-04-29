package com.vaishali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vaishali.model.User;
import com.vaishali.service.UserServiceI;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping("/registration")
	public String preregister() {
		
		return "registration";
			
	}
	
	@GetMapping("/login")
	public String preLogin() {
		return "login";
		
	}
	
	@GetMapping("/reg")
	public String SaveUserController(@ModelAttribute User user) {
		
		int id=userServiceI.SaveUserService(user);
		System.out.println("User save in Db with Id :"+id);
		return "reg";
			
	}
	@GetMapping("/log")
	public String loginCheckController(@ModelAttribute User user) {
		System.out.println(user);
		List<User> list=userServiceI.loginCheckService(user);
		if(list==null) {
		return "loginFail";
	}
	return "loginSuccess";
	}
	

}
