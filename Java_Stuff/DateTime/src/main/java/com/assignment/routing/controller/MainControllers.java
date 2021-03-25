package com.assignment.routing.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainControllers {


	@RequestMapping("/")
	public String hello() {
		return "/index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		
		java.util.Date date=new java.util.Date();
		System.out.println(date);
		model.addAttribute("date", date);
		return "date.jsp";
	}	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalTime time= LocalTime.now();
		System.out.println(time);
		model.addAttribute("time", time);
			return "time.jsp";
	
	}
}
