package com.example.api_dio.service.impl;

import java.util.NoSuchElementException;

import com.example.api_dio.domain.model.User;
import com.example.api_dio.domain.repository.UserRepository;
import com.example.api_dio.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User save(User user) {
        if(userRepository.findById(user.getId()).isPresent()){
            throw new IllegalArgumentException("User já existe");
        }
        return userRepository.save(user);
    }
    
}
