package com.sakthi.microservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringMicroServiceSakApplication {

    public static void main(String[] args) {
        log.info("In Main");
        SpringApplication.run(SpringMicroServiceSakApplication.class, args);
    }


}
