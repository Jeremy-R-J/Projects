package com.boiler.plate.controllers;

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

import com.boiler.plate.models.Book;
import com.boiler.plate.services.BookService;

@Controller
public class BooksController {
	@Autowired//special way to inject service
    private  BookService bookService;
	@RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "new.jsp";
    }
    @RequestMapping(value="/books", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
    
    @GetMapping("/books/{id}/edit")
    public String editBook(@PathVariable("id")Long id, Model model) {
    	Book book= bookService.findBook(id);
    	model.addAttribute("book", book);
    	return "edit.jsp";
    	
    }
   @GetMapping("/books/{id}")
   public String getBook(@PathVariable("id")Long id, Model model) {
	   Book book= bookService.findBook(id);
	   model.addAttribute("book", book);
	   return"show.jsp";
   }
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }
    @PutMapping("/books/{id}")
    public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
    	if (result.hasErrors()) {
    		return"edit.jsp";
    	}else {
    		bookService.updateBook(book);
    		return "redirect:/books";
    	}
    	}
     @RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
    	  public String destroy(@PathVariable("id") Long id) {
    	     bookService.deleteBook(id);
    	     return "redirect:/books";
    	    }
    }
