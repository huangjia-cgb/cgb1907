package com.cy.pj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.pj.pojo.Product;
import com.cy.pj.sevice.ProductService;

@RestController
@RequestMapping("/product/")
public class ProductController {
	@Autowired
	ProductService productService;
	
	
    @RequestMapping("findAll")
	public List<Product>findAll(){
    	List<Product> allList = productService.findAll();
		return allList;
	}

}
