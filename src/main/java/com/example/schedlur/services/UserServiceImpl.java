package com.example.schedlur.services;

import com.example.schedlur.models.User;
import com.example.schedlur.repositories.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public List<User> findAllByFirstName(String firstName) {
        return userRepository.findAllByFirstName(firstName);
    }

    @Override
    public List<User> findAllByLastName(String lastName) {
        return userRepository.findAllByLastName(lastName);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll() ;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
