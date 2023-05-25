package com.olives.cocktable.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.olives.cocktable")
public class CocktableBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CocktableBootApplication.class, args);
    }

}
