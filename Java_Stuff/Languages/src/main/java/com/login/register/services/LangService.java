package com.login.register.services;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.login.register.models.Lang;
import com.login.register.repos.LangRepository;

@Service
public class LangService {
 private static LangRepository langRepository = null;
 
public LangService(LangRepository langRepository) {
     LangService.langRepository = langRepository;
 }
 // returns all the books
 public List<Lang> alllangs() {
     return langRepository.findAll();
 }
 // creates a book
 public static Lang createLang(Lang b) {
     return langRepository.save(b);
 }
 public static Lang editLang(Lang b) {
     return langRepository.save(b);
 }
 public Lang destroyLang(Lang b) {
     return langRepository.save(b);
 }
 // retrieves a book
 public static Lang findLang(Long id) {
     Optional<Lang> optionalLang = langRepository.findById(id);
     if(optionalLang.isPresent()) {
         return optionalLang.get();
     } else {
         return null;
     }
 }
public static void deleteLang(Long id) {
	langRepository.deleteById(id);
	 
  // TODO Auto-generated method stub
	
}
public Lang updateLang(String name, String creator,  int version) {
	// TODO Auto-generated method stub
	return null;
}
public void addLanguage(@Valid Lang lang) {
	// TODO Auto-generated method stub
	
}
}