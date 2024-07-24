package com.example.librarymanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name = "borrow_records")
@Getter
@Setter
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "patron_id")
    private Patron patron;

    @Column(nullable = false)
    private Date borrowDate;

    private Date returnDate;

    // Constructors, getters, and setters
}
