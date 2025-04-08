package com.ndd.repositories.impl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.ndd.pojos.Cart;
import com.ndd.pojos.OrderDetail;
import com.ndd.pojos.SaleOrder;
import com.ndd.repositories.ProductRepository;
import com.ndd.repositories.ReceiptRepository;
import com.ndd.repositories.UserRepository;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Apelion283
 */
@Repository
@Transactional
public class ReceiptRepositoryImpl implements ReceiptRepository{
    
    @Autowired
    LocalSessionFactoryBean factory;
    @Autowired 
    private UserRepository userRepo;
    @Autowired
    private ProductRepository prodsRepo;
    
    @Override
    public void addReceipt(List<Cart> cart) {
       Session s = this.factory.getObject().getCurrentSession();
            SaleOrder r = new SaleOrder();
            r.setCreatedDate(new Date());
            r.setUser(this.userRepo.getUserByUsername("dhthanh"));
            s.persist(r);
            
            for (var c: cart) {
                OrderDetail d = new OrderDetail();
                d.setQuantity(c.getQuantity());
                d.setUnitPrice(c.getPrice());
                d.setProduct(this.prodsRepo.getProductById(c.getId()));
                d.setOrder(r);
                
                s.persist(d);
            }
        
    }
}
