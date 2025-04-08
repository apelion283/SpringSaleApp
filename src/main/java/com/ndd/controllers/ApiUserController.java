/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndd.controllers;

import com.ndd.pojos.User;
import com.ndd.services.UserService;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Apelion283
 */
@RestController
@RequestMapping("/api")
public class ApiUserController {
    
    @Autowired
    private UserService userService;
    
    @PostMapping("/users")
    public ResponseEntity<User> register(@RequestParam("avatar") MultipartFile avatar, @RequestParam Map<String, String> params){
        User user = this.userService.register(params, avatar);
        
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
