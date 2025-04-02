/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndd.controllers;

import com.ndd.pojos.Product;
import com.ndd.services.ProductService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Apelion283
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService prodsService;
    @GetMapping("/products")
    public String productsView(Model model, Map<String, String> params){
        model.addAttribute("product", new Product());
        return "products";
    }
    
    @PostMapping("/add")
    public String create(@ModelAttribute(value = "product") Product p){
        this.prodsService.addOrUpdate(p);
        return "redirect:/";
    }
    
    @GetMapping("/products/{productId}")
    public String productView(Model model, @PathVariable(value = "productId") int id){
        model.addAttribute("product", this.prodsService.getProductById(id));
        return "products";
    }
}
