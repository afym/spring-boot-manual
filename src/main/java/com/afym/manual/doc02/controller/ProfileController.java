package com.afym.manual.doc02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Value("${spring.profiles.active}")
    private String profile;

    @RequestMapping("/doc02/profile-controller-v1")
    public String getProfile() {
        return this.profile;
    }
}
