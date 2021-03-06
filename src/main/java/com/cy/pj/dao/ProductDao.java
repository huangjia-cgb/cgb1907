package com.cy.pj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cy.pj.pojo.Product;

@Mapper
public interface ProductDao {
	
     @Select("select * from product")
	List<Product>findAll();
     @Select("select * from product where id=#{id}")
	Product findById(Integer id);
}
