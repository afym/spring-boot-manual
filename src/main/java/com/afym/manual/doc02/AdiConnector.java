package com.afym.manual.doc02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AdiConnector {
    private String urlUser;

    public String getUrlUser() {
        return urlUser;
    }

    public void setUrlUser(String urlUser) {
        this.urlUser = urlUser;
    }

    @Bean(name = "getAdiConnector")
    @Profile("development")
    public static AdiConnector getUrlDevelopment() {
        AdiConnector connector = new AdiConnector();
        connector.setUrlUser("an url development");
        return connector;
    }

    @Bean(name = "getAdiConnector")
    @Profile("production")
    public static AdiConnector getUrlProduction() {
        AdiConnector connector = new AdiConnector();
        connector.setUrlUser("an url production");
        return connector;
    }
}
