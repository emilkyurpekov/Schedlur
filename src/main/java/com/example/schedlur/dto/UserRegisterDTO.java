package com.example.schedlur.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRegisterDTO {

    @NotEmpty(message = "First name cannot be empty")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    private String lastName;

    @NotEmpty(message = "Phone number is required")
    private String phoneNumber;

    @NotEmpty(message = "Полето за имейл не може да е празно")
    @Email(message = "Моля въведете валиден имейл адрес")
    private String email;

    @NotEmpty(message = "Полето за парола не може да бъде празно")
    @Size(min = 8, message = "Паролата трябва да е дълга минимум 8 символа")
    private String password;

    @NotEmpty(message = "Моля потвърдете паролата си")
    private String confirmPassword;

    @NotEmpty(message = "Моля изберете тип акаунт")
    private String userType;
}