package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/greetings")
	public String greetings(@RequestParam(name = "name") String name, Model model) {
		
		
		
		return new String();
	}
	
	
}
