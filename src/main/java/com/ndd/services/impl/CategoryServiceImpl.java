/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndd.services.impl;

import com.ndd.pojos.Category;
import com.ndd.repositories.CategoryRepository;
import com.ndd.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Apelion283
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
    CategoryRepository catRepo;
    
    @Override
    public List<Category> getCats() {
        return this.catRepo.getCates();
    }
    
}
