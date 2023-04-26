package com.kbstar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/singlepost")
    public String charts(Model model) {
        model.addAttribute("center", "singlepost");
        return "index";
    }


}
