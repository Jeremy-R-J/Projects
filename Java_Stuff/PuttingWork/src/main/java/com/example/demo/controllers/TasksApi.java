package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;
@RestController
public class TasksApi {
    private final TaskService taskService;
    public TasksApi(TaskService taskService){
        this.taskService = taskService;
    }
    @RequestMapping("/api/tasks/")
    public List<Task> showAll(){
    	return taskService.allTasks();
    }
    @RequestMapping(value="/api/tasks/", method=RequestMethod.POST)
    public Task create() {
    	Task task =new Task();
    	return taskService.createTask(task); 
    }
    // other methods removed for brevity
    @RequestMapping(value="/api/tasks/{id}", method=RequestMethod.PUT)
    public String update(@PathVariable("id") Long id,
    		@RequestParam(value="title") String title,
    		@RequestParam(value="desc") String desc,
    		@RequestParam(value="lang") String lang,
    		@RequestParam(value="age") int age) {
//        Task task = taskService.updateTask(id, title, desc, lang, numOfPages);
        return "/";
    }
    
    @RequestMapping(value="/api/tasks/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
//        taskService.deleteTask(id);
    	return "/";
    }
}