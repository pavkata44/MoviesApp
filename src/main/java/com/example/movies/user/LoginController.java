package com.example.movies.user;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public String processLoginForm(Model model,@ModelAttribute("user") User user) {
        if (userService.authenticate(user)) {
            return "redirect:/";
        } else {
            return "login";
        }

    }
//        @GetMapping("/login")
//    public String loginForm(Model model){
//        return "login";
//    }
}
