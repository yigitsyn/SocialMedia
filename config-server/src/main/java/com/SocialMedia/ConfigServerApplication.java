package com.SocialMedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
        //System.out.println(" GIT_USERNAME = " + System.getenv("GIT_USERNAME"));
        //System.out.println("GIT_KEY = " + System.getenv("GIT_KEY"));
    }
}