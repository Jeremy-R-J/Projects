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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.over.it.models.Task;
import com.over.it.models.User;
import com.over.it.services.validator.TaskService;
import com.over.it.services.validator.UserService;

@Controller
public class TaskController {
	@Autowired//special way to inject service
    private  TaskService taskService;
	@Autowired
	private  UserService userService;
	@RequestMapping("/tasks/new")
    public String newTask(@ModelAttribute("task") Task task, Model model, HttpSession session) {
		User user= userService.findUserById((Long)session.getAttribute("userId"));
		model.addAttribute("user", user);
		model.addAttribute("users", userService.allUsers());	
        return "new.jsp";
    }
    @RequestMapping(value="/tasks", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("task") Task task,
    		BindingResult result, HttpSession session,Model model) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
        	model.addAttribute("user", userService.allUsers());
            taskService.createTask(task);
            return "redirect:/tasks";
        }
    }
    
    @GetMapping("/tasks/{id}/edit")
    public String editTask(@PathVariable("id")Long id, Model model, HttpSession session) {
    	User user= userService.findUserById((Long)session.getAttribute("userId"));
    	Task task= taskService.findTask(id);
		model.addAttribute("user", user);
		model.addAttribute("users", userService.allUsers());
		model.addAttribute("task", task);
    	return "edit.jsp";
    	
    }
   @GetMapping("/tasks/{id}")
   public String getTask(@PathVariable("id")Long id, Model model, HttpSession session) {
	   Task task= taskService.findTask(id);
	   User user= userService.findUserById((Long)session.getAttribute("userId"));
	   model.addAttribute("task", task);
	   model.addAttribute("user", user);
		model.addAttribute("users", userService.allUsers());
	   return"show.jsp";
   }
    @RequestMapping("/tasks")
    public String index(Model model, HttpSession session) {
       
        User user= userService.findUserById((Long)session.getAttribute("userId"));
		List<Task> tasks = taskService.allTasks();
		model.addAttribute("user", user);
		model.addAttribute("tasks", tasks);
    	
        return "index.jsp";
    }
    @PutMapping("/tasks/edit/{id}")
    public String updateTask(@Valid @ModelAttribute("task") Task task,
    		BindingResult result, Model model, HttpSession session,@PathVariable("id")Long id) {
    	if (result.hasErrors()) {
    		
        	System.out.println(result.getAllErrors().toString());
    		return"edit.jsp";
    	}else {
    		System.out.println("this edit failed2222222222222222222222222222222222222");
    		User user= userService.findUserById((Long)session.getAttribute("userId"));
    	
    		task.setAssignee(task.getAssignee());
    		task.setPriority(task.getPriority());
    		model.addAttribute("user", user);
    		model.addAttribute("users", userService.allUsers());
    		taskService.updateTask(task);
    		return "redirect:/tasks";
    	}
    	}
     @RequestMapping(value="/tasks/{id}", method=RequestMethod.DELETE)
    	  public String destroy(@PathVariable("id") Long id) {
    	     taskService.deleteTask(id);
    	     return "redirect:/tasks";
    	    }

}

