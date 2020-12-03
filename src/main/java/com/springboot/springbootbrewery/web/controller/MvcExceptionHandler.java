package com.springboot.springbootbrewery.web.controller;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler  extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> list = new ArrayList<>(ex.getErrorCount());

        ex.getAllErrors().forEach(error -> {
            list.add(((DefaultMessageSourceResolvable)error.getArguments()[0]).getCode() + " : " + error.getDefaultMessage());
        });
        return new ResponseEntity<>(list, HttpStatus.BAD_REQUEST);
    }
}
