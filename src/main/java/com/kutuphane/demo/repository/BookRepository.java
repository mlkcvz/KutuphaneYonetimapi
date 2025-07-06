package com.kutuphane.demo.repository;

import com.kutuphane.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
