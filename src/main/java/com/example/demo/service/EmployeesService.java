package com.example.demo.service;

import com.example.demo.model.employees;
import com.example.demo.repo.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository repository;

    public Iterable<employees> all() {
        return repository.findAll();
    }

    public Optional<employees> findById(Long id) {
        return repository.findById(id);
    }

    public employees save(employees student) {
        return repository.save(student);
    }

    public void delete(employees student) {
        repository.delete(student);
    }

}
