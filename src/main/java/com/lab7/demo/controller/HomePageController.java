package com.lab7.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	
	@GetMapping(value = {"/eregistrar/home"})
	public String displayHomePage() {
		
		return "home/index";
	}

}
