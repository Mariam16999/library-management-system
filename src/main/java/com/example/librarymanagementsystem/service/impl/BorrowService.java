package com.example.librarymanagementsystem.service.impl;

import com.example.librarymanagementsystem.entity.Borrow;
import com.example.librarymanagementsystem.entity.Patron;
import com.example.librarymanagementsystem.repository.BookRepo;
import com.example.librarymanagementsystem.repository.BorrowRepo;
import com.example.librarymanagementsystem.repository.PatronRepo;
import com.example.librarymanagementsystem.service.BorrowInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BorrowService implements BorrowInterface {
    private BorrowRepo borrowRepo;
    private BookRepo bookRepo;
    private PatronRepo patronRepo;

    @Override
    public Borrow addBorrow(Borrow borrow) {
        return borrowRepo.save(borrow);
    }

    @Override
    public Borrow updateBorrow(Long bookId, Long patronId, Borrow borrow) {
        borrow.setPatron(patronRepo.findById(patronId).get());
        borrow.setBook(bookRepo.findById(bookId).get());
        return borrowRepo.save(borrow);
    }

    @Override
    public Borrow addBorrow(Long bookId, Long patronId, Borrow borrow) {
        borrow.setPatron(patronRepo.findById(patronId).get());
        borrow.setBook(bookRepo.findById(bookId).get());

        return borrowRepo.save(borrow);
    }
}
