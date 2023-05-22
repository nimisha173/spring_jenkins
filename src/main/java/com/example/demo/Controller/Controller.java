package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class Controller {
    @GetMapping("/welcome")

    public String welcome(){

        return "welcome Aadil";

    }

    @GetMapping("/aadil")

    public String welcomeAadil(){

        return "welcome Aadil A A";
    }


}
