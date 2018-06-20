package com.example.BackendApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BackendApp.model.User;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findById(Long id);

    List<User> findByName(String name);

    List<User> findBySurname(String surname);

    List<User> findByNameAndSurname(String ime, String prezime);

    List<User> findByEmail(String email);
}
