package com.over.it.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.over.it.models.Task;
import com.over.it.models.User;
import com.over.it.services.validator.TaskService;
import com.over.it.services.validator.UserService;
import com.over.it.validator.UserValidator;




@Controller
public class LoginController {
	@Autowired
    private UserService userService;
	@Autowired
	 private UserValidator userValidator;
	@Autowired
	private TaskService taskService;
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "login.jsp";
    }
    @GetMapping("/")
	public String index(HttpSession session, Model model ) {
		//pulls from ID out of session hel
		Long id=(Long) session.getAttribute("userId");
		if(id!=null) {
			User user= userService.findUserById((Long)session.getAttribute("userId"));
			List<Task> tasks = taskService.allTasks();
			model.addAttribute("user", user);
	    	model.addAttribute("tasks", tasks);
		return"index.jsp";
	}
		return "redirect:/login";
	}
   
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user,
    		BindingResult result, HttpSession session) {
    	userValidator.validate(user, result);

        if(result.hasErrors()) {
            return "registrationPage.jsp";
        }
        User u = userService.registerUser(user);
        session.setAttribute("userId", u.getId());
        return "redirect:/";
    }
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email,
    						@RequestParam("password") String password,
    						Model model, HttpSession session,
    						RedirectAttributes flash) {
    	if(userService.authenticateUser(email, password)) {
    		User thisUser= userService.findByEmail(email);
    		session.setAttribute("userId", thisUser.getId());
    		return "redirect:/";
    	}
    	flash.addFlashAttribute("error", "failed to login");
    	return "redirect:/login";
    	// if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    }
    
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	
    	session.invalidate();
    	return "redirect:/";
    	// invalidate session
        // redirect to login page
    }
}