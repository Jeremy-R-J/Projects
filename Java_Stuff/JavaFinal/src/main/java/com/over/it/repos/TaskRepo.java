package com.over.it.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.over.it.models.Task;


@Repository
public interface TaskRepo extends CrudRepository<Task, Long>{
			 // this method retrieves all the books from the database
			  List<Task>findAll();
	 }