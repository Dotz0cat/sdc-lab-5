package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/new_buttons")
    public String newButtons(Model model) {
        model.addAttribute("user", new UserInfo());
        return "new_buttons";
    }

    @PostMapping("/user")
    public String userPost(@ModelAttribute("user") UserInfo user, Model model) {
        model.addAttribute("user", user);
        return "user_result";
    }
}
