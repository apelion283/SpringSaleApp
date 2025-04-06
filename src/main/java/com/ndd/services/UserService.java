/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ndd.services;

import com.ndd.pojos.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Apelion283
 */
public interface UserService extends UserDetailsService{
    User getUserByUsername(String username);
}
