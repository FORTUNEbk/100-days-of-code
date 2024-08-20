package com.example.BookCatalog.repository;

import com.example.bookcatalog.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
