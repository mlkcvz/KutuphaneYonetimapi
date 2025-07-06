package com.kutuphane.demo.controller;

import com.kutuphane.demo.dto.BookBorrowingDTO;
import com.kutuphane.demo.service.BookBorrowingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/borrowings")
@RequiredArgsConstructor
public class BookBorrowingController {

    private final BookBorrowingService bookBorrowingService;

    @PostMapping
    public ResponseEntity<String> borrow(@RequestBody @Valid BookBorrowingDTO dto) {
        String result = bookBorrowingService.borrowBook(dto);
        return result.contains("Stokta") || result.contains("bulunamadı")
                ? ResponseEntity.badRequest().body(result)
                : ResponseEntity.ok(result);
    }
}
