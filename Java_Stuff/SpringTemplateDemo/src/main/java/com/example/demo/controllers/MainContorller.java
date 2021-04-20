package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class MainContorller {

	@RequestMapping("/")
	public String main() {
		return"index.jsp";
	}
	@RequestMapping("/random")
	public String main1() {
		return"index.jsp";
}



@RequestMapping("/index/{id}")
public void showID(@PathVariable Long id) {
	System.out.println();
	
}






















}
