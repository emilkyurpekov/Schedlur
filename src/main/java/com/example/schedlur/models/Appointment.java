package com.example.schedlur.models;

import com.example.schedlur.models.enums.AppointmentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@Getter
@Setter
public class Appointment extends BaseEntity {

    // Each appointment belongs to a User (customer)
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Each appointment belongs to a Business
    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;

    // Each appointment is for a specific Service
    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private AppointmentStatus status = AppointmentStatus.BOOKED;

}
