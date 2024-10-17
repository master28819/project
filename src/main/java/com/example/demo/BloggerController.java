package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@Controller
public class BloggerController {

    private final JdbcTemplate jdbcTemplate;

    public BloggerController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/bloggers")
    public String showBloggers(Model model) {
        String sql = "SELECT * FROM blogger";
        List<Map<String, Object>> bloggers = jdbcTemplate.queryForList(sql);
        model.addAttribute("bloggers", bloggers);
        return "register"; // This should match the name of your HTML file (e.g., blogger.html)
    }
}
