package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Task;
import com.example.demo.repos.TaskRepository;

@Service
public class TaskService {
    // adding the task repository as a dependency
    private final TaskRepository taskRepository;
    
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    // returns all the tasks
    public List<Task> allTasks() {
        return taskRepository.findAll();
    }
    // creates a task
    public Task createTask(Task b) {
        return taskRepository.save(b);
    }
    // retrieves a task
    public Task findTask(Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if(optionalTask.isPresent()) {
            return optionalTask.get();
        } else {
            return null;
        }
    }
}