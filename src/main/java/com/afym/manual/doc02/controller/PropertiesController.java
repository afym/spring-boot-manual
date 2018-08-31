package com.afym.manual.doc02.controller;

import com.afym.manual.doc02.AdiConnector;
import com.afym.manual.doc02.ConfigurationMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {
    @Value("${myProperties.message}")
    private String message1;
    @Value("${myProperties.message2}")
    private String message2;
    @Value("${myProperties.override}")
    private String message3;

    @Value("${mySecret.v1}")
    private String secretV1;
    @Value("${mySecret.v2}")
    private String secretV2;
    @Value("${mySecret.v3}")
    private String secretV3;
    @Value("${mySecret.v4}")
    private String secretV4;
    @Value("${mySecret.v5}")
    private String secretV5;
    @Value("${mySecret.v6}")
    private String secretV6;
    @Autowired
    private ConfigurationMapping configurationMapping;
    @Value("${application.message}")
    // spring.profiles.active=development
    private String messageProfile;
    @Autowired
    private ApplicationContext context;

    @RequestMapping("/doc02/properties-controller-msg1")
    public String getMessage1() {
        return this.message1;
    }

    @RequestMapping("/doc02/properties-controller-msg2")
    public String getMessage2() {
        return this.message2;
    }

    @RequestMapping("/doc02/properties-controller-msg3")
    public String getMessage3() {
        return this.message3;
    }

    @RequestMapping("/doc02/properties-controller-msg4")
    public String getMessage4() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.secretV1).append(" , ")
                .append(this.secretV2).append(" , ")
                .append(this.secretV3).append(" , ")
                .append(this.secretV4).append(" , ")
                .append(this.secretV5).append(" , ")
                .append(this.secretV6).append(" , ");

        return builder.toString();
    }

    @RequestMapping("/doc02/properties-controller-msg5")
    public String getMessage5() {
        return this.configurationMapping.toString();
    }

    @RequestMapping("/doc02/properties-controller-msg6")
    public String getMessage6() {
        return this.messageProfile;
    }

    @RequestMapping("/doc02/properties-controller-msg7")
    public String getMessage7() {
        AdiConnector adiConnector = (AdiConnector) this.context.getBean("getAdiConnector");
        return adiConnector.getUrlUser();
    }
}
