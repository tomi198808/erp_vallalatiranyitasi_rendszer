package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {}