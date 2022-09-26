package com.project.restfulapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.restfulapp.entities.Book;
import com.project.restfulapp.exceptions.BookNotFoundException;
import com.project.restfulapp.service.BookService;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
	@Autowired
	private BookService bookService;
	// Retrieve all
	@GetMapping("/allbooks")
	public List<Book> getAllBooks() {
		
		List<Book> books = null; 
		try {
			books =bookService.getAllBooks();
			
		} catch (BookNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return books;
	}

	// Retrieve by ID
	@GetMapping("/{bookId}")
	public Book getBook(@PathVariable("bookId") Integer bookId) {
		Book book = null;
		try {
			book= bookService.getBook(bookId);
		} catch (BookNotFoundException e) {

			e.printStackTrace();
		}
		return book;
	}
	


	// Save Book
	@PostMapping("/savebook")
	public Book addBook(@RequestBody Book newBook) {
		return bookService.addBook(newBook);
	}

	// Retrieve by Book Name
	@GetMapping("/bookname")
	public Book getBookByName(@RequestParam("bookName") String bookName) {
	//public Book getBookByName(@RequestBody String bookName) {
		Book book = null;
		try {
			book= bookService.getBookByName(bookName);
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		return book;
	}

	// Retrieve by publisher
	@GetMapping("/publisher")
	public List<Book> getBookByPublisher(@RequestParam("publisher") String publisher) {
		List<Book> books = null;
		try {
			books= bookService.getBookByPublisher(publisher);
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		return books;
	}

	// UPDATE Book
	@PutMapping("/updatebookdetails")
	public Book updateBook(@RequestBody Book book) {
		Book bok = null;
		try {
			bok = bookService.updateBook(book);
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		return bok;
	}

	// Delete book
	@DeleteMapping("/deletebookbyid/{id}")
	public String deleteBookById(@PathVariable("id")Integer bookId) {
		String deleteMessage = null;
		try {
			deleteMessage =bookService.deleteBookById(bookId);
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		return deleteMessage;
	}

	// Retrieve by Author
	@GetMapping("/author")
	public List<Book> getBookByAuthor(@RequestParam("author") String author) {
		List<Book> books = null;
		try {
			books= bookService.getBookByAuthor(author);
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		return books;
	}
	
}