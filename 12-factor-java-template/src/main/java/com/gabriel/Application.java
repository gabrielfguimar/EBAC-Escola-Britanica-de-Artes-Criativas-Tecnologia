package com.gabriel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan; // Importe adicionado

@SpringBootApplication
@ComponentScan(basePackages = {"com.gabriel", "main.java.com.gabriel"}) // Força a varredura em ambas as interpretações
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}