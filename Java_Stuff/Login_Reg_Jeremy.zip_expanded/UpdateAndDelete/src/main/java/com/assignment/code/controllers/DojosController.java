package com.assignment.code.controllers;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.assignment.code.models.Dojo;
import com.assignment.code.models.Ninja;
import com.assignment.code.services.DojoService;
import com.assignment.code.services.NinjaService;

@Controller
public class DojosController {
	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/login")
	public String index(Model model, HttpSession session) {
		model.addAttribute("dojos", dojoService.allDojos());
		Long id = (Long) session.getAttribute("userId");
		if(id!=null) {
			return"index.jsp";
		}
		return"redirect:/login";
	}
	@GetMapping("/ninjas")
	public String showNinjas(@ModelAttribute("ninjas")Ninja ninja, Model model) {
		model.addAttribute("ninjas", ninjaService.allNinjas());
		model.addAttribute("newNinja", new Ninja());
		model.addAttribute("dojo", dojoService.allDojos());
		return"ninjas.jsp";
				}
	@GetMapping("/dojos")
	public String showDojos(@ModelAttribute("dojo")Dojo dojo, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return"dojos.jsp";
				}
	@PostMapping("/dojos")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult res) {
		if(res.hasErrors()) {
			return"dojos.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos";
		}
		}
	@PostMapping("/ninjas")
	public String createNinja(@Valid @ModelAttribute("newNinja")Ninja newNinja, BindingResult res) {
		if(res.hasErrors()) {
			return"ninjas.jsp";
		}else {
			ninjaService.createNinja(newNinja);
			return "redirect:/";
		}
		}

//	  @DeleteMapping(value="/ninjas")
//	     public String destroy(@PathVariable("") Long id) {
//	     ninjaService.deleteNinja();
//	     	return "redirect:/";
//	          }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired //auto injects a service or repo
//	    private  LangService dojoService;
//	@GetMapping("/dojos/{id}/edit")
//	public String editDojo(@PathVariable("id")Long id, Model model) {
//		Dojo dojo = dojoService.findDojo(id);
//		model.addAttribute("dojo", dojo);
//		return "edit.jsp";
//	}
//	@PutMapping("/dojos/{id}")
//	public String updateDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result ) {
//		if(result.hasErrors()) {
//			return"edit.jsp";
//		}else {
//			dojoService.updateDojo(dojo);
//			return "redirect:/dojos";
//		}
//		}
//	    @RequestMapping("/dojos/{id}")
//	    public String getDojo(@PathVariable("id")Long id, Model model) {
//	    	Dojo dojo=dojoService.findDojo(id);
//	    	model.addAttribute("dojo", dojo);
//	    	return "show.jsp";
//	    }
//	    
//	    @RequestMapping("/dojos")
//	    public String index(Model model) {
//	        List<Dojo> dojos = dojoService.allDojos();
//	        model.addAttribute("dojos", dojos);
//	        return "index.jsp";
//	    }
//	    @RequestMapping("/")
//	    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
//	            return "new.jsp";
//	    }
//	    @RequestMapping(value="/dojos", method=RequestMethod.POST)
//	        public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
//	            if (result.hasErrors()) {
//	                return "new.jsp";
//	            } else {
//	                dojoService.createDojo(dojo);
//	                return "redirect:/dojos";
//	    }
//
//}
//	        
//	    
//
