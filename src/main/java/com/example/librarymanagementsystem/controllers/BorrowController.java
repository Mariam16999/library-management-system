package com.example.librarymanagementsystem.controllers;

import com.example.librarymanagementsystem.entity.Borrow;
import com.example.librarymanagementsystem.service.BorrowInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class BorrowController {
  private   BorrowInterface  borrowInterface;
  @PostMapping("/borrow/{bookId}/patron/{patronId}")
    public Borrow addBorrow(@RequestBody  Borrow borrow, @PathVariable Long bookId, @PathVariable Long patronId) {

        return borrowInterface.addBorrow(bookId,patronId,borrow);
    }

    @PutMapping("/return/{bookId}/patron/{patronId}")
    public Borrow updateBorrow(@RequestBody Borrow borrow, @PathVariable Long bookId, @PathVariable Long patronId) {

      return borrowInterface.updateBorrow(bookId,patronId,borrow);
    }
}
