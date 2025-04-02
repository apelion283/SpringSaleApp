/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndd.controllers;

import com.ndd.services.CategoryService;
import com.ndd.services.ProductService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Apelion283
 */
@Controller
@ControllerAdvice
public class IndexController {

    @Autowired
    private CategoryService catService;
    
    @Autowired
    private ProductService prodsService;
    
    @ModelAttribute
    public void commonRespond(Model model){
        model.addAttribute("categories", this.catService.getCats());
    }

    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
        model.addAttribute("products", this.prodsService.getProducts(params));
        return "index";
    }
}
