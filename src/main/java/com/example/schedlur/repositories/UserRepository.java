package com.example.schedlur.repositories;

import com.example.schedlur.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    List<User> findAllByFirstName(String firstName);
}
