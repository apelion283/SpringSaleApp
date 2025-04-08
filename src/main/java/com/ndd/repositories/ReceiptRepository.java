/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ndd.repositories;

import com.ndd.pojos.Cart;
import java.util.List;

/**
 *
 * @author Apelion283
 */
public interface ReceiptRepository {
    void addReceipt(List<Cart> cart);
}
