package com.thmjy.joker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class order8000 {
    public static void main(String[] args) {
        SpringApplication.run(order8000.class,args);
    }
}
