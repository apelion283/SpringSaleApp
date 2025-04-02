/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ndd.services;

import com.ndd.pojos.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Apelion283
 */
public interface ProductService {

    List<Product> getProducts(Map<String, String> params);

    Product getProductById(int id);

    void deleteProduct(int id);

    Product addOrUpdate(Product p);

}
