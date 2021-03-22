package com.second.round.repos;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.second.round.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
	    // this method retrieves all the books from the database
	    User findByEmail(String email);
	    }
