package com.second.round.controllers;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;


import com.second.round.models.School;
import com.second.round.models.Student;
import com.second.round.services.SchoolService;
import com.second.round.services.StudentService;




@Controller
public class MainController {
	@Autowired
	private SchoolService schoolService;
	@Autowired
	private StudentService studentService;
	
	
	
	
	@GetMapping("/")
	public String index(HttpSession session) {
		//pulls from ID out of session hel
		Long id=(Long) session.getAttribute("userId");
		if(id!=null) {
		return"index.jsp";
	}
		return "redirect:/login";
	}
	@GetMapping("/students")
	public String showStudents(@ModelAttribute("student")Student student, Model model) {
		model.addAttribute("schools", schoolService.allSchools());
		model.addAttribute("students", studentService.allStudents());
		return"students.jsp";
	}
	@GetMapping("/schools")
	public String showSchools(@ModelAttribute("school")School school, Model model) {
		model.addAttribute("schools", schoolService.allSchools());
		return"schools.jsp";
	}
	@PostMapping("/schools")
	public String createSchool(@Valid @ModelAttribute("school")School school, BindingResult res, Model model ) {
		if (res.hasErrors()) {
		model.addAttribute("schools", schoolService.allSchools());
		
			return"schools.jsp";
		}else {
			schoolService.createSchool(school);
			return "redirect:/schools";}
		}
	@PostMapping("/students")
	public String createStudent(@Valid @ModelAttribute("student")Student student, BindingResult res, Model model ) {
		if (res.hasErrors()) {
		model.addAttribute("schools", schoolService.allSchools());
		model.addAttribute("students", studentService.allStudents());
			return"students.jsp";
		}else {
			studentService.createStudent(student);
			return "redirect:/students";
		}
	
		
	}
}
	
	
	/*@Autowired//special way to inject service
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
    	}}
     @RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
    	  public String destroy(@PathVariable("id") Long id) {
    	     bookService.deleteBook(id);
    	     return "redirect:/books";
    	    }
    }
*/