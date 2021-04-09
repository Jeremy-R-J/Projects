package com.assignment.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class DojoSurveyController {
	@RequestMapping("/")
	public String BubbleBobble() {
			return "index.jsp";
	}
}
