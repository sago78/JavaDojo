package com.sago.myJavaTraining.Sandbox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("title","Welcome to Java World");

        return "home";
    }
}
