package com.example.jkenzie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class JkenzieApplication {

    @GetMapping("/")
    public String jkenzie(){
        return "j kenzie page - 웹훅으로 자동화 빌드배포";
    }
    public static void main(String[] args) {
        SpringApplication.run(JkenzieApplication.class, args);
    }

}
