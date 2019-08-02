package com.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.springboot.example.*"})
public class Application {
    public static void main( String[] args ) {
    	SpringApplication.run(Application.class,args);
    }
}
