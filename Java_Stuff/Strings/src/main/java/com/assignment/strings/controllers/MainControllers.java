package com.assignment.strings.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class MainControllers {

	
//	@RequestMapping("/")
//	public String main(Model model){
//		String word="hello";
//		model.addAttribute("word",word);
//		return"index.jsp";
	@RequestMapping("/")
	public String hello() {
		return "Hello Client! How are you today?";
	
	}
		@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great!  So easy to just respond with strings.";

	}
}
