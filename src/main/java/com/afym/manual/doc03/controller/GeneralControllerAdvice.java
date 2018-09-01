package com.afym.manual.doc03.controller;

import com.afym.manual.doc03.exception.AuthorNotFound;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GeneralControllerAdvice {
    @ExceptionHandler(AuthorNotFound.class)
    public String handleException(HttpServletRequest request, Exception exception) {
        return "post/author/not-found";
    }
}
