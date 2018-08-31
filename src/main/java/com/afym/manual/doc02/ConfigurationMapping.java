package com.afym.manual.doc02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// How can I set the values from my properties ?
@Component
@ConfigurationProperties(prefix = "configuration-mapping")
// remember that you must to set the @EnableConfigurationProperties annotation in the entry point
/*
 Description:

Configuration property name 'configurationMapping' is not valid:

    Invalid characters: 'M'
    Bean: configurationMapping
    Reason: Canonical names should be kebab-case ('-' separated), lowercase alpha-numeric characters and must start with a letter
* */
public class ConfigurationMapping {
    private int fooValue;
    private int varValue;
    private String randomValue;
    private double piValue;

    public int getFooValue() {
        return fooValue;
    }

    public void setFooValue(int fooValue) {
        this.fooValue = fooValue;
    }

    public int getVarValue() {
        return varValue;
    }

    public void setVarValue(int varValue) {
        this.varValue = varValue;
    }

    public String getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(String randomValue) {
        this.randomValue = randomValue;
    }

    public double getPiValue() {
        return piValue;
    }

    public void setPiValue(double piValue) {
        this.piValue = piValue;
    }

    @Override
    public String toString() {
        return "ConfigurationMapping{" +
                "fooValue=" + fooValue +
                ", varValue=" + varValue +
                ", randomValue='" + randomValue + '\'' +
                ", piValue=" + piValue +
                '}';
    }
}
