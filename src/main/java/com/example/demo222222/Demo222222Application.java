package com.example.demo222222;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class Demo222222Application {

    @GetMapping
    public String string(){
        return "string";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo222222Application.class, args);
    }

}
