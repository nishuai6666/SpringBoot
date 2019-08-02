package com.springboot.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.example.dto.User;
import com.springboot.example.service.UserService;


@Controller
//@RequestMapping(value = "/login")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login")
	public String home(){
		System.out.println("登录");
		User user = userService.selectUserByName("孙志国");
		System.out.println(user.getName());
		
		ModelAndView mode = new ModelAndView();
		mode.addObject("name", user.getName());
		//mode.setViewName("home/page");
		
		return "/home/page";
	}
	
	
	@RequestMapping(value="/home/page")
	@ResponseBody
	public ModelAndView goHome(){
		System.out.println("go to the home page!");
		ModelAndView mode = new ModelAndView();
		mode.addObject("name", "zhangsan");
		mode.setViewName("index");
		return mode;
	}


	
	
}
