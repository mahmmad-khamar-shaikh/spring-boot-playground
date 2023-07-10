package com.zaynsys.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandlineRunner(String[] args) {
        CommandLineRunner helloWorld;
        helloWorld = runner -> {
            System.out.println("hello world");
        };
        return helloWorld;

    }

}
