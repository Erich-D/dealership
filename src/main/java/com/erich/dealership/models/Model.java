package com.erich.dealership.models;

import javax.persistence.*;

import com.erich.dealership.enums.PurchaseTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thymeleaf.util.DateUtils;

/**
 *
 * @author etdeh
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name="models")
public class Model {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Long modelId;
    @Column(name = "model",nullable = false,length = 45,unique = true)
    private String model;
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private User user;
    @ManyToOne
    @JoinColumn(name="make_id", nullable=false)
    private Make make;
}
