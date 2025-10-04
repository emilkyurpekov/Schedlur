package com.example.schedlur.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "users")
@Getter
@Setter
public class User extends BaseEntity {
    @Column(nullable=false)
    private String firstName;

    @Column(nullable=false)
    private String lastName;

    @Column(nullable=false)
    private String phoneNumber;

    @Column(nullable=false,unique=true)
    private String email;

    @Column(nullable=false)
    private String password;


}
