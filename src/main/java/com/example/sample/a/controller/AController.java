package com.example.sample.a.controller;

import com.example.sample.a.service.AService;
import com.example.sample.directory.Directory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AController {

    public static final String HOME = Directory.HOME;

    @Autowired
    private AService aService;

    @GetMapping("/a")
    public String base(Model model) {

//        aService.base();
        model.addAttribute("view", HOME + "home");

        return "view";
    }
}
