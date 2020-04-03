package com.ducat.springboot.thymeleaf.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {

	@Autowired
	private Platform platform;
	
	@RequestMapping(value= "/", method= RequestMethod.GET)
	public String home() {
		System.out.println(getClass() + "- Spring boot is working! Index page is invoked.");
		return "index";
	}

	@RequestMapping(value= "/welcome", method= RequestMethod.GET)
	public ModelAndView welcome() {
		System.out.println(getClass() + "- Welcome page is invoked.");

		ModelAndView mav = new ModelAndView();
		mav.addObject("mymsg", platform.getDomainUrl().getBaseUrl());
		mav.setViewName("welcome");
		return mav;
	}
}