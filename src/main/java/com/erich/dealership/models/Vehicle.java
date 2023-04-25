package com.erich.dealership.models;

import javax.persistence.*;

import com.erich.dealership.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author etdeh
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name="vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "vehicle_id",nullable = false)
    private Long vehicle_id;
    @Enumerated(EnumType.STRING)
    @Column(name = "type",nullable = false,length = 45)
    private VehType type;
    @Enumerated(EnumType.STRING)
    @Column(name = "body_style",nullable = false,length = 45)
    private BodyStyles bodyStyle;
    @Column(name = "year",nullable = false,length = 4)
    private int year;
    @Enumerated(EnumType.STRING)
    @Column(name = "transmission",nullable = false,length = 45)
    private Transmission transmission;
    @Enumerated(EnumType.STRING)
    @Column(name = "color",nullable = false,length = 45)
    private ExColor color;
    @Enumerated(EnumType.STRING)
    @Column(name = "interior",nullable = false,length = 45)
    private IntColor interior;
    @Column(name = "mileage",nullable = false,length = 45)
    private double mileage;
    @Column(name = "vin",nullable = false,length = 45,)
    private String vin;
    @Column(name = "msrp",nullable = false,length = 45)
    private double msrp;
    @Column(name = "sale_price",nullable = false,length = 45)
    private double salePrice;
    @Column(name = "description",nullable = false,length = 254)
    private String description;
    @ManyToOne
    @JoinColumn(name="model_id", nullable=false)
    private Model model;
}
