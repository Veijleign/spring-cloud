package ru.ignis.microservices.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/client1") // корневой URI
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(instanceId);
    }

}
