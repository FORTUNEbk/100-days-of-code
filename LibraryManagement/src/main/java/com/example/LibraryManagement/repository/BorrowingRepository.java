package com.example.LibraryManagement.repository;

import com.example.library.model.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {
    List<Borrowing> findByBorrowerId(Long borrowerId);
    List<Borrowing> findByBookId(Long bookId);
}
