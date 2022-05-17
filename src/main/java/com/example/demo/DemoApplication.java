package com.example.demo;

import com.example.demo.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xulin
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(DemoApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
