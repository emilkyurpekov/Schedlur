package com.example.schedlur.Controllers;

import com.example.schedlur.dto.UserRegisterDTO;
import com.example.schedlur.services.BusinessOwnerServiceImpl;
import com.example.schedlur.services.UserServiceImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthenticationController {

    private final UserServiceImpl userService;
    private final BusinessOwnerServiceImpl businessOwnerService;

    public AuthenticationController(UserServiceImpl userService,
                                    BusinessOwnerServiceImpl businessOwnerService) {
        this.userService = userService;
        this.businessOwnerService = businessOwnerService;
    }

    @GetMapping("/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("user", new UserRegisterDTO());
        return "register";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") UserRegisterDTO userDto,
                               BindingResult result) {

        if (!userDto.getPassword().equals(userDto.getConfirmPassword())) {
            result.rejectValue("confirmPassword", "error.user", "Паролите не съвпадат!");
        }

        if (result.hasErrors()) {
            return "register";
        }

        try {
            if ("BUSINESS".equals(userDto.getUserType())) {
                businessOwnerService.register(userDto);
            } else {
                userService.register(userDto);
            }
        } catch (IllegalArgumentException e) {
            result.rejectValue("email", "error.user", e.getMessage());
            return "register";
        }

        return "redirect:/login";
    }
}