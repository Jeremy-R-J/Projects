package com.assignment.code.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.assignment.code.models.Dojo;
import com.assignment.code.services.DojoService;

@Controller
public class DojosController {
	@Autowired //auto injects a service or repo
	    private  DojoService dojoService;
	@GetMapping("/dojos/{id}/edit")
	public String editDojo(@PathVariable("id")Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "edit.jsp";
	}
	@PutMapping("/dojos/{id}")
	public String updateDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result ) {
		if(result.hasErrors()) {
			return"edit.jsp";
		}else {
			dojoService.updateDojo(dojo);
			return "redirect:/dojos";
		}
		}
	    @RequestMapping("/dojos/{id}")
	    public String getDojo(@PathVariable("id")Long id, Model model) {
	    	Dojo dojo=dojoService.findDojo(id);
	    	model.addAttribute("dojo", dojo);
	    	return "show.jsp";
	    }
	    
	    @RequestMapping("/dojos")
	    public String index(Model model) {
	        List<Dojo> dojos = dojoService.allDojos();
	        model.addAttribute("dojos", dojos);
	        return "index.jsp";
	    }
	    @RequestMapping("/")
	    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
	            return "new.jsp";
	    }
	    @RequestMapping(value="/dojos", method=RequestMethod.POST)
	        public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
	            if (result.hasErrors()) {
	                return "new.jsp";
	            } else {
	                dojoService.createDojo(dojo);
	                return "redirect:/dojos";
	    }
	    }
	     @RequestMapping(value="/dojos/{id}", method=RequestMethod.DELETE)
	     public String destroy(@PathVariable("id") Long id) {
	     dojoService.deleteDojo(id);
	     	return "redirect:/dojos";
	          }

//	            @RequestMapping(value="/api/dojos/{id}", method=RequestMethod.DELETE)
//	            public String destroy(@PathVariable("id") Long id,Dojo dojo, BindingResult result) {
//	            	dojoService.deleteDojo(id);
	            }
	        
	    

