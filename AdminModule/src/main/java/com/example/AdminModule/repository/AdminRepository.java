package com.example.AdminModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AdminModule.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
