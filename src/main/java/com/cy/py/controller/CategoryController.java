package com.cy.py.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.py.pojo.Category;
import com.cy.py.sevice.CategoryService;

@RestController
@RequestMapping("/Category/")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    
    
    @RequestMapping("findAllCategory")
	public List<Category> findAllCategory(){
    List<Category> findCategory = categoryService.findCategory();
    return findCategory;
	}
	
}
