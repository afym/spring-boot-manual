package com.afym.manual.doc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class I18nWebController {

    @GetMapping("/i18n")
    public String post(){
        return "i18n";
    }
}
