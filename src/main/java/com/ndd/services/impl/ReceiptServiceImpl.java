/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndd.services.impl;

import com.ndd.pojos.Cart;
import com.ndd.repositories.ReceiptRepository;
import com.ndd.services.ReceiptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Apelion283
 */
@Service
public class ReceiptServiceImpl implements ReceiptService{
    
    @Autowired
    private ReceiptRepository receiptRepo;

    @Override
    public void addReceipt(List<Cart> cart) {
        this.receiptRepo.addReceipt(cart);
    }
    
}
