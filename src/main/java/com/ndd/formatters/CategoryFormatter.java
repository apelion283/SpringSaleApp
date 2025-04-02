/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndd.formatters;

import com.ndd.pojos.Category;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Apelion283
 */
public class CategoryFormatter implements Formatter<Category>{

    @Override
    public String print(Category cat, Locale locale) {
        return String.valueOf(cat.getId());
    }

    @Override
    public Category parse(String catId, Locale locale) throws ParseException {
        Category cat = new Category();
        cat.setId(Integer.valueOf(catId));
        return cat;
    }
    
}
