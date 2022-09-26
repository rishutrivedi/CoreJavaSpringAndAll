package com.prodapt.resttemplateclient.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.resttemplateclient.client.BookClient;

@RestController
@RequestMapping("/bookapiclient")
public class BookClientController {
	@Autowired
	private BookClient bookClient;
	
	//http://localhost:8081/bookapiclient/allbooks
	@GetMapping("/allbooks")
	public List<Book> getAllBooks() {
		return bookClient.getAllBooks();
	}
}