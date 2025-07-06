package com.kutuphane.demo.controller;

import com.kutuphane.demo.entity.Book;
import com.kutuphane.demo.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public ResponseEntity<Book> create(@RequestBody @Valid Book book) {
        return ResponseEntity.ok(bookService.saveBook(book));
    }
}
