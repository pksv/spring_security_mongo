package com.pksv.security_mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SecurityMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityMongoApplication.class, args);
    }

}
