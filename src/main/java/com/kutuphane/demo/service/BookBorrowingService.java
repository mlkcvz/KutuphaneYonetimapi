package com.kutuphane.demo.service;

import com.kutuphane.demo.dto.BookBorrowingDTO;

public interface BookBorrowingService {
    String borrowBook(BookBorrowingDTO dto);
}
