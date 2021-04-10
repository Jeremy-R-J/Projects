package com.assignment.code.controllers;



import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.assignment.code.models.User;

import com.assignment.code.services.UserService;

//imports removed for brevity
@Controller
public class LoginController {
	@Autowired
	private  UserService userService;
	

 
// @RequestMapping("/reg")
// public String registerForm(@ModelAttribute("user") User user) {
//     return "reg.jsp";
// }
 @RequestMapping("/")
 public String login(HttpSession session, User user) {
	 return "/login.jsp";
 }
 
 @RequestMapping(value="/registration", method=RequestMethod.POST)
 public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
//     userValidator.validate(user, result);
     if(result.hasErrors()) {
    	 System.out.println("TEST");
         return "login.jsp";
     }
     User u = userService.registerUser(user);
     session.setAttribute("userId", u.getId());
     System.out.println("TEST22222");
     return "redirect:/index";
 }
 
 @RequestMapping(value="/login", method=RequestMethod.POST)
 public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes flash) {
     if(userService.authenticateUser(email, password)){
    	 User thisUser=userService.findByEmail(email);
    	 session.setAttribute("userId", thisUser.getId());
	 return"redirect:/index";
	 } System.out.println("TEST33333333333333333");
     flash.addFlashAttribute("error","Your login has failed!");
     System.out.println("TEST4444444444444444444444444");
     return "redirect:/login";
 }
// 
// @RequestMapping("/home")
// public String home(HttpSession session, Model model) {
//	return"redirect:index.jsp";
//     // get user from session, save them in the model and return the home page
// }
 @RequestMapping("/logout")
 public String logout(HttpSession session) {
	 
	 session.invalidate();
     // invalidate session
     // redirect to login page
	 return"redirect:/";
 }
}