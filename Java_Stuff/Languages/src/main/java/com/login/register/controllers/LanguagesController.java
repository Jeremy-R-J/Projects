package com.login.register.controllers;

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


import com.login.register.models.Lang;
import com.login.register.services.LangService;


	@Controller
	public class LanguagesController {
		@Autowired //auto injects a service or repo
		    private  LangService langService;
		@GetMapping("/langs/{id}/edit")
		public String editLang(@PathVariable("id")Long id, Model model) {
			Lang lang= LangService.findLang(id);
			model.addAttribute("lang", lang);
			return "update.jsp";
		}
		@PutMapping("/langs/{id}")
		public String updateLang(@Valid @ModelAttribute("lang")Lang lang, BindingResult result ) {
			if(result.hasErrors()) {
				return"update.jsp";
			}else {
				LangService.createLang(lang);
				return "redirect:/view";
			}
			}
		    @RequestMapping("/index/{id}")
		    public String getLang(@PathVariable("id")Long id, Model model) {
//		    	Lang lang=new Lang();
		    	model.addAttribute("lang", new Lang());
		    	return "index.jsp";
		    }
		    
		    @RequestMapping("/")
		    public String index(Model model) {
		        List<Lang> langs = langService.alllangs();
		        model.addAttribute("langs", langs);
		        return "index.jsp";
		    }
		    @RequestMapping("/view")
		    public String newLang(@ModelAttribute("lang") Lang lang) {
		            return "view.jsp";
		    }
		    @RequestMapping(value="/langs", method=RequestMethod.POST)
		        public String create(@Valid @ModelAttribute("lang") Lang lang, BindingResult result) {
		            if (result.hasErrors()) {
		                return "index.jsp";
		            } else {
		            	LangService.createLang(lang);
		                return "redirect:/views";
		    }
		    }
		     @RequestMapping(value="/langs/{id}", method=RequestMethod.DELETE)
		     public String destroy(@PathVariable("id") Long id) {
		    	 LangService.deleteLang(id);
		     	return "redirect:/langs";
		          }

	}