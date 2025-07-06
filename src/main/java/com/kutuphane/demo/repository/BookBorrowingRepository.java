package com.kutuphane.demo.repository;

import com.kutuphane.demo.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookBorrowingRepository extends JpaRepository<BookBorrowing, Long> {
}
