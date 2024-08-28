package com.tapiwanashe.helloworld.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tapiwanashe.helloworld.dto.Greeting;

@RestController
@RequestMapping("api/v1/hello")
public class HelloWorldController {
    


    @GetMapping("/greeting")
    public ResponseEntity<Greeting>  sayHello(){

        return ResponseEntity.ok().body(new Greeting("Hie", "Hie people"));
    }


}
