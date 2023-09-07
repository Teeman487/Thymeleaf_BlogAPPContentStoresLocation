package net.ummuaqibatulkhair.thymeleaf_blogappcontentstoreslocation.controller;

import net.ummuaqibatulkhair.thymeleaf_blogappcontentstoreslocation.model.RegisterForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class RegisterController {
    // handler method to handle registration page request
    // http://localhost:8080/register
    @GetMapping("register")
    public String registrationPage(Model model) {
        // Empty Register Form model object to store form data
        RegisterForm register = new RegisterForm();
        model.addAttribute("RegisterForm", register);

        List<String> listProfession = Arrays.asList("Caterer","Developer","Architect", "Others");
        model.addAttribute("listProfession",listProfession);
        return "register";

    }
    // handler method to handle facebook registration form submission request
    @PostMapping("register/save")
    public String submitForm(Model model,
                             @ModelAttribute("RegisterForm") RegisterForm registerForm) {
        model.addAttribute("RegisterForm", registerForm);
        return "registerSuccess";

    }
}
