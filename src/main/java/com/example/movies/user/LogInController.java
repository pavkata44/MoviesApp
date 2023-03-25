package com.example.movies.user;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LogInController {
    private final UserService userService;

    public LogInController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public String processLoginForm(@ModelAttribute("user") User user,Model model) {
        if (userService.authenticate(user)) {
            return "redirect:/";
        }
        else {
            model.addAttribute("error", "Incorrect Username & Password");
            return "login";
        }
    }
        @GetMapping("/login")
    public String loginForm(Model model){
        return "login";
    }
}
