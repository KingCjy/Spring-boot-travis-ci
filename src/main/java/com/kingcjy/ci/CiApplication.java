package com.kingcjy.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiApplication.class, args);
    }

    @GetMapping("/ping")
    public String pong() {
        return "pong";
    }
}
