package com.example.librarymanagementsystem.controllers;

import com.example.librarymanagementsystem.entity.Patron;
import com.example.librarymanagementsystem.service.PatronInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PatronController {
   private PatronInterface patronInterface;
   @GetMapping("/patrons")
    public List<Patron> retrieveAll() {
        return patronInterface.retrieveAll();
    }

    @GetMapping("/patrons/{id}")
    public Optional<Patron> findById(@PathVariable Long id) {
        return patronInterface.findById(id);
    }

    @PostMapping("/patrons")
    public Patron addPatron(@RequestBody Patron patron) {
        return patronInterface.addPatron(patron);
    }

    @PutMapping("/patrons/{id}")
    public Patron updatePatron(@RequestBody Patron patron,@PathVariable Long id) {
       patron.setId(id);
        return patronInterface.updatePatron(patron);
    }
    @DeleteMapping("/patrons/{id}")
    public void deletePatron(@PathVariable Long id) {
        patronInterface.deletePatron(id);
    }

}
