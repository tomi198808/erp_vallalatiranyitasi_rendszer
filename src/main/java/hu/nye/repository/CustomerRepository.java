package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {}