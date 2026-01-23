package com.example.schedlur.repositories;

import com.example.schedlur.models.BusinessOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BusinessOwnerRepository extends JpaRepository<BusinessOwner, Long> {
    BusinessOwner findByEmail(String email);
}
