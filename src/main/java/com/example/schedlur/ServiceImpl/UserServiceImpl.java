package com.example.schedlur.ServiceImpl;

import com.example.schedlur.models.User;
import com.example.schedlur.repositories.UserRepository;
import com.example.schedlur.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public List<User> findByFirstName(String firstName) {
        return userRepository.findAllByFirstName(firstName);
    }

    @Override
    public List<User> findByLastName(String lastName) {
        return List.of();
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
