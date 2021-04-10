package com.assignment.code.services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.code.models.Ninja;
import com.assignment.code.repos.NinjaRepository;

	@Service
	public class NinjaService {

	 // adding the book repository as a dependency
	@Autowired
	private final NinjaRepository ninjaRepository;
	 
	public NinjaService(NinjaRepository ninjaRepository) {
	     this.ninjaRepository = ninjaRepository;
	 }
	 // returns all the books
	 public List<Ninja> allNinjas() {
	     return ninjaRepository.findAll();
	 }
	 // creates a book
	 public Ninja createNinja(Ninja b) {
	     return ninjaRepository.save(b);
	 }
	 public Ninja updateNinja(Ninja b) {
	     return ninjaRepository.save(b);
	 }
	 public Ninja destroyNinja(Ninja b) {
	     return ninjaRepository.save(b);
	 }
	 // retrieves a book
	 public Ninja findNinja(Long dojoId) {
	     Optional<Ninja> optionalNinja = ninjaRepository.findById(dojoId);
	     if(optionalNinja.isPresent()) {
	         return optionalNinja.get();
	     } else {
	         return null;
	     }
	 }
	public void deleteNinja(Long id) {
		ninjaRepository.deleteById(id);
		 
	  // TODO Auto-generated method stub
		
	}
	public Ninja updateNinja(Long id, String firstName, String lastName, Integer age) {
		// TODO Auto-generated method stub
		return null;
	}
	}


