package me.tocertify.getcertified.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "GetCertified");
        model.addAttribute("subtitle","My personal certification web app");

        return "home";
    }
}
