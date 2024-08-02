package com.cbt.userservicejul24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceJul24Application {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceJul24Application.class, args);
    }

}
