package com.example.lamquangloc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Lâm Quang Lộc");
        model.addAttribute("initials", "LQL");
        model.addAttribute("role", "Backend Developer");
        model.addAttribute("bio",
            "Sinh viên ngành Công nghệ Thông tin, đam mê lập trình backend và xây dựng ứng dụng web. " +
            "Có kinh nghiệm làm việc với Java Spring Boot, containerization bằng Docker và tự động hóa CI/CD qua GitHub Actions.");
        model.addAttribute("school", "ĐH Công nghệ TP.HCM (HUTECH)");
        model.addAttribute("major", "Công nghệ Thông tin");
        model.addAttribute("email", "lamquangloc@example.com");
        model.addAttribute("github", "github.com/lamquangloc");
        model.addAttribute("skills",
            java.util.List.of("Java", "Spring Boot", "Docker", "GitHub Actions", "MySQL", "Thymeleaf", "Maven", "Git"));
        return "index";
    }
}
