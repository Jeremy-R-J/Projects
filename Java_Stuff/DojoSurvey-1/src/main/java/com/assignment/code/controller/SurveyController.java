package com.assignment.code.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
		}

	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String result(@RequestParam(value="yourname") String yourname,
						@RequestParam(value="location") String location,
						@RequestParam(value="favLang") String favLang,
						@RequestParam(value="comments") String comment,
						HttpSession session) {
	session.setAttribute("yourname", yourname);
	session.setAttribute("location", location);
	session.setAttribute("favLang", favLang);
	session.setAttribute("comment", comment);
	return"redirect:/result";
		
	
	}

	@RequestMapping("/result")
	public String resultsPage() {
		return "result.jsp";
		}
}