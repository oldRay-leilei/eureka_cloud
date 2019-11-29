package com.bw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class applicationServer2 {
    public static void main(String[] args) {
        SpringApplication.run(applicationServer2.class);
    }
}
