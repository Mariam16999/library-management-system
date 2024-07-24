package com.example.librarymanagementsystem.repository;

import com.example.librarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepo extends JpaRepository<Borrow,Long> {
}
