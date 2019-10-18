package com.cy.py.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.py.dao.ProductDao;
import com.cy.py.pojo.Product;
import com.cy.py.sevice.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
  
	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Product> findAll() {
		
		
		return productDao.findAll();
	}
	

}
