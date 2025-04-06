/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ndd.repositories;

import com.ndd.pojos.User;

/**
 *
 * @author Apelion283
 */
public interface UserRepository {
    User getUserByUsername(String username);
}
