package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {}