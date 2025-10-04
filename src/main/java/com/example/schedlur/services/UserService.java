package com.example.schedlur.services;

import com.example.schedlur.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAllByFirstName(String firstName);
    List<User> findAllByLastName(String lastName);
    User findByEmail(String email);
    List<User> findAll();
    User save(User user);

}
