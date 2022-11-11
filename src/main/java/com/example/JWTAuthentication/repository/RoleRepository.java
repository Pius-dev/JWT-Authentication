package com.example.JWTAuthentication.repository;

import com.example.JWTAuthentication.entities.ERole;
import com.example.JWTAuthentication.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}