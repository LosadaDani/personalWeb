package com.example.webPersonal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String home(){
        return "viewFront/home";
    }

    @GetMapping("/experience")
    public String experience(){
        return "viewFront/experience";
    }

    @GetMapping("/education")
    public String education(){
        return "viewFront/education";
    }

    @GetMapping("/projects")
    public String projects(){
        return "viewFront/projects";
    }

    @GetMapping("/skills")
    public String skills(){
        return "viewFront/skills";
    }
}
