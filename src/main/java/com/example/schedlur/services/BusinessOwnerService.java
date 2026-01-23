package com.example.schedlur.services;

import com.example.schedlur.dto.UserRegisterDTO;
import com.example.schedlur.models.BusinessOwner;

public interface BusinessOwnerService {
    void register(UserRegisterDTO dto);
    BusinessOwner findByEmail(String email);
}
