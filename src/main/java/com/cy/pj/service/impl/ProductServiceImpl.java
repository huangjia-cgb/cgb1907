package com.cy.pj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.dao.ProductDao;
import com.cy.pj.pojo.Product;
import com.cy.pj.sevice.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
  
	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Product> findAll() {
		
		
		return productDao.findAll();
	}
	

}
