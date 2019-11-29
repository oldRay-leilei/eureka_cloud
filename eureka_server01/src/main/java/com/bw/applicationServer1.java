package com.bw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class applicationServer1 {
    public static void main(String[] args) {
        SpringApplication.run(applicationServer1.class);
    }
}
