package net.ummuaqibatulkhair.thymeleaf_blogappcontentstoreslocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Modules: Spring MVC and Spring Security
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentStoresController {
    //handler method to handle / ContentStores request
    //
    @GetMapping("/content-stores")
    public String contentStores(Model model){
        model.addAttribute("message","UmmuAqibatul-Khair Content&Stores will be released soon!");  // add data into Model
        return "content-stores";  // view
    }
}