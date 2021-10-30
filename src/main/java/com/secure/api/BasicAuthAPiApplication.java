package com.secure.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.secure")
public class BasicAuthAPiApplication {

  public static void main(String[] args) {
    SpringApplication.run(BasicAuthAPiApplication.class, args);
  }
}
