package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;

@Controller
public class TasksContoller {
		@Autowired
		private TaskService taskService;
	    
	    @RequestMapping("/tasks")
	    public String index(Model model) {
	        List<Task> tasks = taskService.allTasks();
	        model.addAttribute("tasks", tasks);
	        return "index.jsp";
	    }
	    @RequestMapping("/tasks/new")
	    public String newTask(@ModelAttribute("task") Task task) {
	         return "/new.jsp";
	    }
	    @RequestMapping(value="/tasks", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("task") Task task, BindingResult result) {
	    if (result.hasErrors()) {
	    	return "new.jsp";
	    } else {
	    	taskService.createTask(task);
	    	return "redirect:/tasks";
	           
	        }
	    }
	}
