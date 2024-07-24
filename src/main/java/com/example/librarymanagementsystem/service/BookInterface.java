package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.entity.Book;

import java.util.List;
import java.util.Optional;


public interface BookInterface {
  List<Book> retrieveAll();
  Optional<Book> findById(Long id);
  Book addBook(Book book);
  Book updateBook(Book book);
  void deleteBook(Long id);
}
