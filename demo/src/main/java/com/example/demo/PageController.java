package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/page")
    public String page() {
        return "basic_page";
    }
    @GetMapping("/buttons")
    public String buttons() {
        return "buttons";
    }
    @PostMapping("/buttons")
    public String buttonsPost(Model model, @RequestParam("value") String valueFromController) {
        model.addAttribute("valueFromController", valueFromController);
        return "buttons";
    }
}
