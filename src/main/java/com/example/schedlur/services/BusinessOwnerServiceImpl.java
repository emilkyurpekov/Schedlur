package com.example.schedlur.services;

import com.example.schedlur.dto.UserRegisterDTO;
import com.example.schedlur.models.BusinessOwner;
import com.example.schedlur.repositories.BusinessOwnerRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BusinessOwnerServiceImpl implements BusinessOwnerService {

    private final BusinessOwnerRepository businessOwnerRepository;
    private final PasswordEncoder passwordEncoder;

    public BusinessOwnerServiceImpl(BusinessOwnerRepository businessOwnerRepository,
                                    PasswordEncoder passwordEncoder) {
        this.businessOwnerRepository = businessOwnerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public void register(UserRegisterDTO dto) {
        if (businessOwnerRepository.findByEmail(dto.getEmail()) != null) {
            throw new IllegalArgumentException("Email already registered as a business");
        }

        BusinessOwner owner = new BusinessOwner();
        owner.setFirstName(dto.getFirstName());
        owner.setLastName(dto.getLastName());
        owner.setPhoneNumber(dto.getPhoneNumber());
        owner.setEmail(dto.getEmail());

        owner.setPassword(passwordEncoder.encode(dto.getPassword()));

        businessOwnerRepository.save(owner);
    }

    @Override
    public BusinessOwner findByEmail(String email) {
        return businessOwnerRepository.findByEmail(email);
    }
}