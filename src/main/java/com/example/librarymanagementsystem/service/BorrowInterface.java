package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.entity.Borrow;

public interface BorrowInterface {
  Borrow  addBorrow(Borrow borrow);
  Borrow updateBorrow(Long bookId, Long patronId, Borrow borrow);

  Borrow addBorrow(Long bookId, Long patronId, Borrow borrow);

}
