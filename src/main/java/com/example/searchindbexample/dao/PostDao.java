package com.example.searchindbexample.dao;

import com.example.searchindbexample.model.Post;
import com.example.searchindbexample.repo.PostRepository;
import lombok.Data;
import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class PostDao implements Dao<Post> {

    private final PostRepository postRepository;

    @Override
    public Post find(Post post) throws NoSuchFieldException {
        Post post1 = null;

        if (!post.getTitle().isEmpty()){
            post1 = postRepository.findByTitleContaining(post.getTitle());
        }
        else if (!post.getContent().isEmpty()){
            post1 = postRepository.findByContentContaining(post.getContent());
        }
        else {
            throw new NoSuchFieldException("""
                    Your data is empty.
                    Id not be checked
                    """);
        }


        return post1;
    }



    @Override
    public Post update(Post beforeChange, Post afterChange) {
        return null;
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }


}
