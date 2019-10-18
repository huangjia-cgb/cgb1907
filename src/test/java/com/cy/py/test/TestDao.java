package com.cy.py.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.py.dao.CategoryDao;
import com.cy.py.pojo.Category;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDao {
	@Autowired
	CategoryDao categoryDao;
	
    @Test
	public void testFindAllCategory() {
		  List<Category> categoryList = categoryDao.findCategory();
		  for (Category category : categoryList) {
			System.out.println(category);
		}
	}
	
}
