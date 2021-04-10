package com.assignment.code.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.code.models.Dojo;
import com.assignment.code.services.DojoService;


	@RestController
	public class DojoApi {
	    private final DojoService dojoService;
	    public DojoApi(DojoService dojoService){
	        this.dojoService = dojoService;
	    }
	    @RequestMapping("/api/test")
	    public String test() {
	    	return "This is the web server speaking.";
	    }
	    
	    @RequestMapping("/api/dojos")
	    public List<Dojo> showALl(){
	    	return dojoService.allDojos();
	    }
	    @RequestMapping(value="/api/dojos", method=RequestMethod.POST)
	    public Dojo create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
	    	Dojo dojo = new Dojo();
	    	return dojoService.createDojo(dojo);
	    }
	    	
	    	
	     
	    @RequestMapping(value="/api/dojos/{id}", method=RequestMethod.PUT)
	    public String update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
	         dojoService.updateDojo(id, title, desc, lang, numOfPages);
	        return "";
	    }
	    
	    @RequestMapping(value="/api/dojos/{id}", method=RequestMethod.DELETE)
	    public void destroy(@PathVariable("id") Long id) {
	    	dojoService.deleteDojo(id);
	    	
	    }
	}

