package com.example.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Pavan";
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Bye Pavan";
    }

}
