package com.example.api_dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.example.api_dio.domain.model.Post;
import com.example.api_dio.domain.repository.PostRepository;
import com.example.api_dio.service.PostService;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post findById(Integer id) {
        return postRepository.findById(id).orElseThrow(NoSuchElementException::new);
        
    }

    @Override
    public Post save(Post post) {
        if(postRepository.findById(post.getId()).isPresent()){
            throw new IllegalArgumentException("Post já existe");
        }
        return postRepository.save(post);
    }

}
