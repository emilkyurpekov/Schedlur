package com.example.schedlur.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;
import java.math.BigDecimal;

@Entity
@Table(name = "services")
@Getter
@Setter
public class Service extends BaseEntity {
    //type of services the business offer(e.g. Haircut, Hair coloring etc.)
    @Column(nullable = false, length = 100)
    private String type;

    @Column(nullable = false)
    private int durationMinutes;
//prices for each service
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;

}
