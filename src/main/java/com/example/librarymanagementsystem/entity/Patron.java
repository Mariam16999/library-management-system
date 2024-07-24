package com.example.librarymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "PATRON")
@Getter
@Setter
public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String mobileNumber;

    @OneToMany(mappedBy = "patron")
    @JsonIgnore // Add this annotation to break the loop
    private List<Borrow> borrows;

    // Constructors, getters, and setters
}
