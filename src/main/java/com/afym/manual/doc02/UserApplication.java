package com.afym.manual.doc02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserApplication {
    @Bean
    // the name of this bean by default is going to be "getUserBean"
    // you can define another name for your bean @Bean(name = "rootUserBean")
    public UserEntity getUserBean() {
        return new UserEntity("root", "root@afym.com");
    }
}