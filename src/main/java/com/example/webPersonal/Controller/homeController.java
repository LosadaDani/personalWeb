package com.example.webPersonal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String home(){
        return "viewFront/home";
    }

    @GetMapping("/resume")
    public String resume(){
        return "viewFront/resume";
    }

    @GetMapping("/projects")
    public String projects(){
        return "viewFront/projects";
    }

    @GetMapping("/contact")
    public String contact(){
        return "viewFront/contact";
    }
}
