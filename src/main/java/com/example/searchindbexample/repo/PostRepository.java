package com.example.searchindbexample.repo;

import com.example.searchindbexample.model.Post;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    Post findByTitleContaining(String title);

    Post findByContentContaining(String content);



}
