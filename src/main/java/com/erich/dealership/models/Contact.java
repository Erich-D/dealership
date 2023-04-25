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
@Table (name="contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long contact_id;
    @Column(name = "f_name",nullable = false,length = 45)
    private String firstName;
    @Column(name = "l_name",length = 45)
    private String lastName;
    @Column(name = "email",length = 45)
    private String email;
    @Column(name = "phone",length = 10)
    private int phone;
    @Column(name = "message",nullable = false,length = 256)
    private String message;
}
