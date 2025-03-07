package com.Ashutosh.ashu.Controller;

import com.Ashutosh.ashu.dto.UserDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String sayHellowithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/hello/param/{name}")
    public String sayHellowithParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/post")
    public String sayHelloDTO(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
    @PutMapping("/hello/put/{firstName}")
    public String sayHelloToPut(
            @PathVariable String firstName,
            @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}