/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erich.dealership.models;

import javax.persistence.*;

import com.erich.dealership.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 *
 * @author etdeh
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name="users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "f_name",nullable = false,length = 45)
    private String firstName;
    @Column(name = "l_name",nullable = false,length = 45)
    private String lastName;
    @Column(name = "password",nullable = false,length = 256)
    private String password;
    @Column(name = "email",nullable = false,length = 45)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "role",nullable = false,length = 45)
    private Role role;
    @OneToMany(mappedBy="user")
    private Set<Sale> sales;
    @OneToMany(mappedBy="user")
    private Set<Model> models;
    @OneToMany(mappedBy="user")
    private Set<Make> makes;
}

