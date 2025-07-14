package com.veiga.workshopmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.veiga.workshopmongo")
public class WorkshopmongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkshopmongoApplication.class, args);
    }

}
