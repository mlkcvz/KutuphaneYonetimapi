package com.kutuphane.demo.service.impl;

import com.kutuphane.demo.dto.BookBorrowingDTO;
import com.kutuphane.demo.entity.Book;
import com.kutuphane.demo.entity.BookBorrowing;
import com.kutuphane.demo.repository.BookBorrowingRepository;
import com.kutuphane.demo.repository.BookRepository;
import com.kutuphane.demo.service.BookBorrowingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class BookBorrowingServiceImpl implements BookBorrowingService {

    private final BookRepository bookRepository;
    private final BookBorrowingRepository bookBorrowingRepository;

    @Override
    public String borrowBook(BookBorrowingDTO dto) {
        Book book = bookRepository.findById(dto.getBookId()).orElse(null);
        if (book == null) return "Kitap bulunamadı.";
        if (book.getStock() <= 0) return "Stokta kitap kalmadı.";

        BookBorrowing borrowing = new BookBorrowing();
        borrowing.setBook(book);
        borrowing.setBorrowerName(dto.getBorrowerName());
        borrowing.setBorrowedAt(LocalDate.now());

        book.setStock(book.getStock() - 1);
        bookBorrowingRepository.save(borrowing);
        bookRepository.save(book);
        return "Kitap ödünç verildi.";
    }
}
