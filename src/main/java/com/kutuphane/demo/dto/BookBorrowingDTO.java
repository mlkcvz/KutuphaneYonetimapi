package com.kutuphane.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BookBorrowingDTO {
    @NotBlank
    private String borrowerName;
    private Long bookId;
}
