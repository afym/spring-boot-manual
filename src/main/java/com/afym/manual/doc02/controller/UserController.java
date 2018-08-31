package com.afym.manual.doc02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private ApplicationContext context;

    @Autowired
    public void context(ApplicationContext context) { this.context = context; }

    @RequestMapping("/doc02/user-controller-root-name")
    // How can I get a been in my controller ?
    public String getRootName(){
        return this.context.getBean("getUserBean").toString();
    }
}
