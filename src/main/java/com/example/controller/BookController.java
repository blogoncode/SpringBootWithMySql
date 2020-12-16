package com.example.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/books")
	private List<Book> getAllBooks() {
		return bookService.loadAllBooks();
	}

	@GetMapping("/books/{id}")
	private Book getBooks(@PathVariable("id") int id) {
		return bookService.loadBookById(id);
	}

	@PostMapping("/books/save")
	private Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@PutMapping("/books/update")
	private Book update(@RequestBody Book book) {
		bookService.updateBook(book);
		return book;
	}

	@DeleteMapping("/books/delete/{id}")
	private void deleteBook(@PathVariable("id") int id) {
		bookService.deleteBook(id);
	}
}
