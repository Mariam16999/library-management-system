package com.example.librarymanagementsystem.service;


import com.example.librarymanagementsystem.entity.Patron;
import com.example.librarymanagementsystem.repository.PatronRepo;

import java.util.List;
import java.util.Optional;

public interface PatronInterface {
    List<Patron> retrieveAll();
    Optional<Patron> findById(Long id);
    Patron addPatron(Patron book);
    Patron updatePatron (Patron book);
    void deletePatron (Long id);
}
