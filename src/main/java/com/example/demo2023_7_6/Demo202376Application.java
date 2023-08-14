package com.example.demo2023_7_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = "com.example", nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class)
public class Demo202376Application {


    public static void main(String[] args) {
        SpringApplication.run(Demo202376Application.class, args);
    }

}
