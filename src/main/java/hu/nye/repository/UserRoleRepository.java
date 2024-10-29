package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.model.UserRole;


public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {}