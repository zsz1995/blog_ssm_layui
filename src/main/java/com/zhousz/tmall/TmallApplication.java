package com.zhousz.tmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.zhousz.tmall")
public class TmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmallApplication.class, args);
    }
}
