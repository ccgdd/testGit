package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    
     public RestTemplate restTemplate1(){
        String name = "jack"
        return new RestTemplate();
    }
    public RestTemplate restTemplate11(){
        return new RestTemplate();
    }
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public RestTemplate restTemplate3(){
        return new RestTemplate();
    }
}
