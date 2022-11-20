package com.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController {
	
	@GetMapping("/")
    public String viewHomePage() {
        return "view";
    }

}
