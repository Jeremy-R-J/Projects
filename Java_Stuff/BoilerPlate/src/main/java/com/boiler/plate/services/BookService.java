package com.boiler.plate.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boiler.plate.models.Book;
import com.boiler.plate.repos.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        
    }
    // Getter like
    public List<Book> allBooks() {
    	
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
 // updates a book
    public Book updateBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}

}
