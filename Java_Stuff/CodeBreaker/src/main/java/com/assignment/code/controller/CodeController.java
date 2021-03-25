package com.assignment.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




@Controller
public class CodeController {

	@RequestMapping("/")
	public String index() {
			return "index.jsp";
	}
	@RequestMapping(value= "/GotIt", method=RequestMethod.POST)
	public String GotIt(@RequestParam(value="code")String code, RedirectAttributes error) {
		
		if(code.equalsIgnoreCase("bushido")) {
		return "GotIt.jsp";
	}
		else {error.addFlashAttribute("error", "Try again sucka!");
		return "redirect:/";
		}
	
	
	}
	
}