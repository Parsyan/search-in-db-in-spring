package com.example.searchindbexample.controller;

import com.example.searchindbexample.dao.PostDao;
import com.example.searchindbexample.model.Post;
import com.example.searchindbexample.repo.PostRepository;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Supplier;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/"})
public class PostController {


    private final PostDao postDao;

    @GetMapping({"/posts/"})
    public List<Post> postList(){
        return postDao.findAll();
    }

    @GetMapping({"/post/"})
    public Post postSearch(@RequestBody Post post) throws NoSuchFieldException {
        return postDao.find(post);
    }


}
