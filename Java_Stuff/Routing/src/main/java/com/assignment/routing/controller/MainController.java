package com.assignment.routing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "Coding" ;
    }
    @RequestMapping("/coding")
	public String index1() {
        return "Hello Coding Dojo!" ;
    }
    @RequestMapping("/coding/python")
   	public String index2() {
           return "Python/Django was awesome!" ;
       }
    @RequestMapping("/coding/java")
   	public String index3() {
           return "Java/Spring is better!" ;
       }



}
