package com.example.togglzTest.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.togglzTest.properties.Property;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableAutoConfiguration()
public class TogglzTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TogglzTestApplication.class, args);
    }
}
