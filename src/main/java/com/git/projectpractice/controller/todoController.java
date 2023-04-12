package com.git.projectpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoController {
    @GetMapping("/")
    public String start() {
        return "To Do Application!";
    }
}

//브랜치 머지 위해 의미없이 생성해봤어요