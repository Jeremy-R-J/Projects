package com.assignment.routing.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class DojoContoller {
	

	 @RequestMapping("{dojoLocation}")
		public String dojo(@PathVariable("dojoLocation")String dojoLocation) {
		 if (dojoLocation.equals("dojo")) {
			 return "The dojo is awesome!";
			  }
		 if (dojoLocation.equals("burbank")) {
			 return "Burbank Dojo is located in Southern California!";
		 }
		 if (dojoLocation.equals("sanjose")) {
			 return "display a text that says 'SJ dojo is the headquarters";
		 }
		return "/";			  }
}
