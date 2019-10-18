package com.cy.pj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cy.pj.pojo.Category;

@Mapper
public interface CategoryDao {
     @Select("select * from category")
	List<Category>findCategory();
}
