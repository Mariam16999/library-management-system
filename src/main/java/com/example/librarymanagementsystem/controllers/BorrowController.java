package com.example.librarymanagementsystem.controllers;

import com.example.librarymanagementsystem.entity.Borrow;
import com.example.librarymanagementsystem.service.BorrowInterface;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Log4j2
public class BorrowController {
  private   BorrowInterface  borrowInterface;
  @PostMapping("/borrow/{bookId}/patron/{patronId}")
    public Borrow addBorrow(@RequestBody  Borrow borrow, @PathVariable Long bookId, @PathVariable Long patronId) {
        log.info("borrow"+borrow);
        return borrowInterface.addBorrow(bookId,patronId,borrow);
    }

    @PutMapping("/return/{bookId}/patron/{patronId}")
    public Borrow updateBorrow(@RequestBody Borrow borrow, @PathVariable Long bookId, @PathVariable Long patronId) {
      log.info("borrow"+borrow);
      return borrowInterface.updateBorrow(bookId,patronId,borrow);
    }
}
