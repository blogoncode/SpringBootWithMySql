package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Book;
import com.example.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public List<Book> loadAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	public Book loadBookById(int id) {
		return bookRepository.findById(id).get();
	}
	
	public Book saveBook(Book book) {
		bookRepository.save(book);
		return loadBookById(book.getId());
	}

	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}
	
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

}