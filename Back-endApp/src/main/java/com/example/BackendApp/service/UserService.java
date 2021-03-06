package com.example.BackendApp.service;

import java.util.List;

import com.example.BackendApp.model.User;


public interface UserService {

    List<User> findAll();

    User findOne(Long id);

    User save(User user);

    User delete(Long id);

    User findByEmail(String email);

    List<User> findByName(String name);

    List<User> findBySurname(String surname);

    List<User> findByNameAndSurname(String name, String surname);

}
