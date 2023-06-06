package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emps")
@CrossOrigin
public class EmployeeController {
    public EmployeeController() {
        System.out.println("inside emp controller");
    }
}
