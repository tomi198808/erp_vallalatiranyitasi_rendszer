package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.model.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Integer> {}