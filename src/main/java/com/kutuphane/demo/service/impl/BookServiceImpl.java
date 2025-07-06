package com.kutuphane.demo.service.impl;

import com.kutuphane.demo.entity.Book;
import com.kutuphane.demo.repository.BookRepository;
import com.kutuphane.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
