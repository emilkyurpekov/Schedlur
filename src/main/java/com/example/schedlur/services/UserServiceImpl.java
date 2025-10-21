package com.example.schedlur.services;

import com.example.schedlur.models.User;
import com.example.schedlur.repositories.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
    public User register(User user) {
        if(userRepository.findByEmail(user.getEmail()) != null){
            throw new IllegalArgumentException("Email already registered");
        }

        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
    }

    @Override
    public User updateUser(Long id, User updatedUser) {
        User existing = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existing.setFirstName(updatedUser.getFirstName());
        existing.setLastName(updatedUser.getLastName());
        existing.setEmail(updatedUser.getEmail());

        return userRepository.save(existing);
    }
}
