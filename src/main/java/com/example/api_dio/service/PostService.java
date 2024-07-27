package com.example.api_dio.service;

import com.example.api_dio.domain.model.Post;

public interface PostService {
    Post findById(Integer id);
    Post save(Post post);
}
