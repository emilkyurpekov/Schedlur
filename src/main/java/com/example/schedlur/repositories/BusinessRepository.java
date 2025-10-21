package com.example.schedlur.repositories;

import com.example.schedlur.models.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BusinessRepository extends JpaRepository<Business, Long> {
}
