/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erich.dealership.repositories;

import com.erich.dealership.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author etdeh
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
