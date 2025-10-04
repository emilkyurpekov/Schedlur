package com.example.schedlur.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity(name = "businesses")
@Getter
@Setter
public class Business extends BaseEntity{

    @Column(length = 50, nullable = false)
    private String name;

    @Column(nullable = false)
    private String registeredAddress;

    @Column(nullable = false,length = 9,unique = true)
    private String UICCode;


    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private BusinessOwner owner;

    // One business can have many services
    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Service> services;
}
