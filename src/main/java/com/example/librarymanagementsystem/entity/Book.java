package com.example.librarymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long  id;
    @Column(nullable = false)
   private String title;
    @Column(nullable = false)
   private  String author;
    @Column(nullable = false)
   private String publicationYear;
    @Column(nullable = false)
   private String isbn;

    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private List<Borrow> borrows;

}
