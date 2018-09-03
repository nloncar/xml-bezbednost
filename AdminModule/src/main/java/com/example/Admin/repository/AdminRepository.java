package com.example.Admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Admin.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
