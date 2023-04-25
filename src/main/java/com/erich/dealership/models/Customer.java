package com.erich.dealership.models;

import javax.persistence.*;

import com.erich.dealership.enums.State;
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
@Table (name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "f_name",nullable = false,length = 45)
    private String firstName;
    @Column(name = "l_name",nullable = false,length = 45)
    private String lastName;
    @Column(name = "email",nullable = false,length = 45)
    private String email;
    @Column(name = "street_one",nullable = false,length = 45)
    private String streetOne;
    @Column(name = "street_two",length = 45)
    private String streetTwo;
    @Column(name = "city",nullable = false,length = 45)
    private String city;
    @Enumerated(EnumType.STRING)
    @Column(name = "state",nullable = false,length = 45)
    private State state;
    @Column(name = "zipcode",nullable = false,length = 5)
    private int zipcode;
    @OneToMany(mappedBy="customer")
    private Set<Sale> sales;
}
