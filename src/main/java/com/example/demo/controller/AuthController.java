package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login"; // Maps to /WEB-INF/jsp/login.jsp
    }

    @PostMapping("/login")
    public String loginUser(User user, Model model, HttpSession session) {
        User existingUser = userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (existingUser != null) {
            session.setAttribute("loggedInUser", existingUser);
            return "redirect:/home";
        } else {
            model.addAttribute("errorMessage", "Invalid username or password.");
            return "login";
        }
    }

    @GetMapping("/")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // Maps to /WEB-INF/jsp/register.jsp
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        userService.saveUser(user);
        model.addAttribute("successMessage", "User registered successfully!");
        return "login"; // Redirect to login after registration
    }

    @GetMapping("/home")
    public String home(HttpSession session) {
        if (session.getAttribute("loggedInUser") != null) {
            return "home"; // Maps to /WEB-INF/jsp/home.jsp
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}