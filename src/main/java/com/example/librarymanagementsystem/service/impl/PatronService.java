package com.example.librarymanagementsystem.service.impl;

import com.example.librarymanagementsystem.entity.Patron;
import com.example.librarymanagementsystem.repository.PatronRepo;
import com.example.librarymanagementsystem.service.PatronInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PatronService implements PatronInterface {
  private   PatronRepo patronRepo;
    @Override
    public List<Patron> retrieveAll() {
        return patronRepo.findAll();
    }

    @Override
    public Optional<Patron> findById(Long id) {
        return patronRepo.findById(id);
    }

    @Override
    public Patron addPatron(Patron patron) {
        return patronRepo.save(patron);
    }

    @Override
    public Patron updatePatron(Patron patron) {
        return patronRepo.save(patron);
    }

    @Override
    public void deletePatron(Long id) {
      patronRepo.deleteById(id);
    }
}
