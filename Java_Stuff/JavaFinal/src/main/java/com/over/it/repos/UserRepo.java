package com.over.it.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.over.it.models.User;




@Repository
public interface UserRepo extends CrudRepository<User, Long>{
		 // this method retrieves all the books from the database
		   User findByEmail(String email);
		   List<User>findAll();
 }