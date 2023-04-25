package com.erich.dealership.models;

import javax.persistence.*;
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
@Table (name="specials")
public class Special {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "special_id")
    private Long specialId;
    @Column(name = "title",nullable = false,length = 45,unique = true)
    private String title;
    @Column(name = "date_created")
    private java.sql.Timestamp dateCreated;
    @Column(name = "description", nullable = false)
    private String description;
}
