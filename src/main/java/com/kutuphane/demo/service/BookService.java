package com.kutuphane.demo.service;

import com.kutuphane.demo.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book saveBook(Book book);
}
