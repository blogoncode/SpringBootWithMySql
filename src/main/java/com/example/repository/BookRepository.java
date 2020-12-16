package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
