package com.login.register.repos;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.login.register.models.Lang;

 

	
	@Repository
	public interface LangRepository extends CrudRepository<Lang, Long>{
	    // this method retrieves all the books from the database
	    List<Lang> findAll();
	    // this method finds books with descriptions containing the search string
	    
	    Long countByNameContaining(String search);
	    // this method deletes a book that starts with a specific title
	    Long deleteByNameStartingWith(String search);
		
	    
	}

