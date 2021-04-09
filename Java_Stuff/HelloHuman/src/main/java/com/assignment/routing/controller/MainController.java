package com.assignment.routing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
@RequestMapping("/")
public String human(@RequestParam(value="name", required=false)String name, Model model) {
	if (name!= null) {
		model.addAttribute("name", name);
		return "index.jsp";
	}
	else {
			model.addAttribute("name", "Human");
			return "index.jsp";
		}
	}
}

