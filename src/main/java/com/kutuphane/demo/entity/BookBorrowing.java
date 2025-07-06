package com.kutuphane.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrowings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String borrowerName;

    private LocalDate borrowedAt;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
