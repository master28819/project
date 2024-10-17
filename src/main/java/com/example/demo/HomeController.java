package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Add any data to the model if needed
        return "home"; // Home page
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login"; // Login page
    }

    @GetMapping("/register")
    public String register(Model model) {
        return "register"; // Register page
    }
    
    @GetMapping("/create")
    public String createPost(Model model) {
        return "create"; // Create post page
    }
    
    @PostMapping("/create")
    public String savePost(Model model, String title, String body, String topic, boolean publish) {
        // Here you would handle saving the post to your database
        // For example, you could call a service to save the post
        
        // Redirect back to the posts management page or another appropriate page
        return "redirect:/admin/posts"; // Change this to your desired redirect URL
    }
}