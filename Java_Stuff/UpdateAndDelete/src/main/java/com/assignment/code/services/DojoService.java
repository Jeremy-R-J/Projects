package com.assignment.code.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assignment.code.models.Dojo;
import com.assignment.code.repos.DojoRepository;

@Service
public class DojoService {
 // adding the book repository as a dependency
private final DojoRepository dojoRepository;
 
public DojoService(DojoRepository dojoRepository) {
     this.dojoRepository = dojoRepository;
 }
 // returns all the books
 public List<Dojo> allDojos() {
     return dojoRepository.findAll();
 }
 // creates a book
 public Dojo createDojo(Dojo b) {
     return dojoRepository.save(b);
 }
 public Dojo updateDojo(Dojo b) {
     return dojoRepository.save(b);
 }
 public Dojo destroyDojo(Dojo b) {
     return dojoRepository.save(b);
 }
 // retrieves a book
 public Dojo findDojo(Long id) {
     Optional<Dojo> optionalDojo = dojoRepository.findById(id);
     if(optionalDojo.isPresent()) {
         return optionalDojo.get();
     } else {
         return null;
     }
 }
public void deleteDojo(Long id) {
	dojoRepository.deleteById(id);
	 
  // TODO Auto-generated method stub
	
}
public Dojo updateDojo(Long id, String title, String desc, String lang, Integer numOfPages) {
	// TODO Auto-generated method stub
	return null;
}
}
