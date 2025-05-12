package com.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.plaf.synth.SynthOptionPaneUI;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index()
    {
        //System.out.println("Inside  index  controller");
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        //System.out.println("Inside  login  controller");
        return "login";
    }

   @GetMapping("/register")
   public String register()
    {
        //System.out.println("Inside  register  controller");
        return "register";
    }
}
