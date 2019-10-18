package com.cy.py.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cy.py.pojo.Product;

@Mapper
public interface ProductDao {
	
     @Select("select * from product")
	List<Product>findAll();
}
