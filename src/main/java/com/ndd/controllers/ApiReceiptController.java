/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndd.controllers;

import com.ndd.pojos.Cart;
import com.ndd.services.ReceiptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Apelion283
 */
@RestController
@RequestMapping("/api")
public class ApiReceiptController {
    
    @Autowired
    private ReceiptService receiptService;
    
    @PostMapping("/receipts")
    @ResponseStatus(HttpStatus.OK)
    public void addReciept(@RequestBody List<Cart> cart){
        this.receiptService.addReceipt(cart);
    }
}
