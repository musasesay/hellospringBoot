package com.example.hello.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hello")

public class HelloProperties {

    private String welcomeMsg="Hello, World";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {

        this.welcomeMsg = welcomeMsg;
    }
}
