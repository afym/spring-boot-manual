package com.afym.manual;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import static java.util.Arrays.*;

// Spring boot uses all this 3 annotations :
//@Configuration :
//@EnableAutoConfiguration :
//@ComponentScan : Scan components or services in this package
@SpringBootApplication
@ComponentScan({"com.afym.manual.controller", "com.afym.manual.doc02"})
public class ManualApplication {

    public static void main(String[] args) {
        ApplicationContext context;
        context = SpringApplication.run(ManualApplication.class, args);
        getListOfBeans(context);
        getUserBeanFromDoc02(context);
    }

    // How can I get all the bean names ?
    private static void getListOfBeans(ApplicationContext context) {
        String[] names = context.getBeanDefinitionNames();
        sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
    // How can I get a been in my context ?
    private static void getUserBeanFromDoc02(ApplicationContext context) {
        System.out.println(context.getBean("getUserBean").toString());
    }
}
