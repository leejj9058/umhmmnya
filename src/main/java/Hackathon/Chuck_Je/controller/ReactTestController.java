package Hackathon.Chuck_Je.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactTestController {
    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }
}
