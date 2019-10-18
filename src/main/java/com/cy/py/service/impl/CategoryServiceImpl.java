package com.cy.py.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.py.dao.CategoryDao;
import com.cy.py.pojo.Category;
import com.cy.py.sevice.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
   @Autowired
   CategoryDao categoryDao;
	

	@Override
	public List<Category> findCategory() {
		// TODO Auto-generated method stub
	return categoryDao.findCategory();
	}
}
