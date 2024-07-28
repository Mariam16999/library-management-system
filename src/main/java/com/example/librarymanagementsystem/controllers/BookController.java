package com.example.librarymanagementsystem.controllers;

import com.example.librarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.service.BookInterface;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@Log4j2

public class BookController {
    private BookInterface bookInterface;
    @GetMapping("/books")
    public List<Book> retrieveAll() {
        log.info("retrieveAll");
        return bookInterface.retrieveAll();
    }
    @GetMapping("/books/{id}")
    public Optional<Book> findById(@PathVariable Long id) {
        log.info("findById"+id);
        return bookInterface.findById(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        log.info("addbook"+book);
        return bookInterface.addBook(book);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable Long id,@RequestBody Book book) {

        book.setId(id);
        log.info("updateBook"+book);
        return bookInterface.updateBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id) {
        log.info("deleteBook"+id);
        bookInterface.deleteBook(id);
    }

}
