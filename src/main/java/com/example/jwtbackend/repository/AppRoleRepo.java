package com.example.jwtbackend.repository;

import com.example.jwtbackend.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepo extends JpaRepository<AppRole,Long> {
    AppRole findAppRoleByName(String name);
}
