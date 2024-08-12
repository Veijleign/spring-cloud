package com.test.eurekaclient2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/client2") // корневой URI
public class TestController {

    @GetMapping("/new")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("NEW");
    }

}
