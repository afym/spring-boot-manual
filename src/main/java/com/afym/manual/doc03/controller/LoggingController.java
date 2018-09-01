package com.afym.manual.doc03.controller;

import com.afym.manual.doc03.exception.AuthorNotFound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoggingController {
    private Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/post/{slug}")
    public String list(@PathVariable(value = "slug") String slug) throws Exception {

        if (slug.equals("posting")) {
            logger.error("Ups some error in line 20");
            throw new Exception("Your post is now available for code " + slug);
        }

        return "post/view";
    }

    @GetMapping("/post/author/{slug}")
    public String user(@PathVariable(value = "slug") String slug) throws Exception {

        if (slug.equals("1919")) {
            logger.error("Ups some error in line 31");
            throw new AuthorNotFound("Your author is not found " + slug);
        }

        return "post/view";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(HttpServletRequest request, Exception exception) {
        this.logger.error("Something wrong happened when ");
        return "post/not-found";
    }
}
