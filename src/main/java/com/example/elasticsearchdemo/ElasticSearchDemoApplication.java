package com.example.elasticsearchdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElasticSearchDemoApplication {
    @Value("${my.profile}")
    private String profile;

    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchDemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello ElasticSearch in profile " + profile;
    }

}
