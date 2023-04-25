package com.erich.dealership.models;

import javax.persistence.*;

import com.erich.dealership.enums.PurchaseTypes;
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
@Table (name="sales")
public class Sale {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Long saleId;
    @Column(name = "purchase_price",nullable = false,length = 45)
    private double purchasePrice;
    @Enumerated(EnumType.STRING)
    @Column(name = "purchase_type",length = 45,nullable = false)
    private PurchaseTypes purchaseType;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_id", referencedColumnName = "vehicleId")
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;
}
