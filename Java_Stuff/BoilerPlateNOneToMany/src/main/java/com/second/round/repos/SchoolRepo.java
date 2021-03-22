package com.second.round.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.second.round.models.School;


@Repository
public interface SchoolRepo extends CrudRepository<School, Long>{
    // this method retrieves all the books from the database
    List<School> findAll();
    // this method finds books with descriptions containing the search string
	/*
	 * List<School> findByDescriptionContaining(String search); // this method
	 * counts how many titles contain a certain string Long
	 * countByTitleContaining(String search); // this method deletes a book that
	 * starts with a specific title Long deleteByTitleStartingWith(String search);
	 */
}