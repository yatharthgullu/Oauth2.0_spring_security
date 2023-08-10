package com.spring.security.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/home")
public class HomeController {





    @GetMapping("/user")
    public ResponseEntity<String> normalUser(){
        return ResponseEntity.ok("yses i am normal user");
    }
    @GetMapping("/admin")
    public ResponseEntity<String> adminUser(){
        return ResponseEntity.ok("yses i am admin  user");
    }
    @GetMapping("/public")
    public ResponseEntity<String> publiclUser(){
        return ResponseEntity.ok("yses i am public user");
    }
}
