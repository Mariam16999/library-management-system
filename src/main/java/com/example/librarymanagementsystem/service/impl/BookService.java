package com.example.librarymanagementsystem.service.impl;

import com.example.librarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.repository.BookRepo;
import com.example.librarymanagementsystem.service.BookInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor //generate constructor
public class BookService implements BookInterface {


   private BookRepo bookRepo;
    @Override
    public List<Book> retrieveAll() {

        return bookRepo.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepo.findById(id);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public void deleteBook(Long id) {
         bookRepo.deleteById(id);
    }
}
