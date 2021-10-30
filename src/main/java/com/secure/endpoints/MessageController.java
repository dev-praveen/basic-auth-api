package com.secure.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/message")
public class MessageController {

  @GetMapping("/wish/{name}")
  public String sayIt(@PathVariable String name) {

    return Mono.just("Hi " + name + " Good day!").block();
  }
}
