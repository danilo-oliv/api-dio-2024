package com.example.api_dio.service;

import com.example.api_dio.domain.model.User;

public interface UserService {
    User findById(Integer id);
    User save(User user);
}
