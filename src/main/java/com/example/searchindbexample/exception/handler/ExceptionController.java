package com.example.searchindbexample.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ExceptionController {

    @ExceptionHandler({NoSuchFieldError.class})
    public ResponseEntity<Exception> handleNotField(Exception e){
        return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
    }
}
