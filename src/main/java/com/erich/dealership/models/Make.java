package com.erich.dealership.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Make.
 *
 * @author etdeh
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name="makes")
public class Make {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "make_id")
    private Long makeId;
    @Column(name = "make",nullable = false,length = 45,unique = true)
    private String make;
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
