package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class JavaK8sDemoApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot, Docker, Kubernetes, and GitHub Actions!!!!!!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaK8sDemoApplication.class, args);
    }
}
