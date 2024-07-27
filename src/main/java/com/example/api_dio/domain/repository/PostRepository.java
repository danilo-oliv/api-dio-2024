package com.example.api_dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api_dio.domain.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
