package com.over.it.services.validator;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.over.it.models.Task;
import com.over.it.repos.TaskRepo;



@Service
public class TaskService {
    // adding the task repository as a dependency
	@Autowired
    private TaskRepo taskRepository;
    
    // Getter like
    public List<Task> allTasks() {
    	
        return taskRepository.findAll();
    }
    // creates a task
    public Task createTask(Task b) {
        return taskRepository.save(b);
    }
 // updates a task
    public Task updateTask(Task b) {
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
	public void deleteTask(Long id) {
		taskRepository.deleteById(id);
		
	}

}
