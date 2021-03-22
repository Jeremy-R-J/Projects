package com.second.round.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.round.models.Student;
import com.second.round.repos.StudentRepo;

@Service
public class StudentService {
    // adding the student repository as a dependency
	@Autowired
    private  StudentRepo studentRepository;
    
 
    // Getter like
    public List<Student> allStudents() {
    	
        return studentRepository.findAll();
    }
    // creates a student
    public Student createStudent(Student b) {
        return studentRepository.save(b);
    }
 // updates a student
    public Student updateStudent(Student b) {
        return studentRepository.save(b);
    }
    // retrieves a student
    public Student findStudent(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isPresent()) {
            return optionalStudent.get();
        } else {
            return null;
        }
    }
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
		
	}

}