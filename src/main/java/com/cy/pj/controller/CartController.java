package com.cy.pj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.pj.common.vo.JsonResult;
import com.cy.pj.pojo.Cart;
import com.cy.pj.pojo.CartItem;
import com.cy.pj.pojo.Product;
import com.cy.pj.sevice.ProductService;

@RestController
@RequestMapping("/cart/")
public class CartController {
      @Autowired
       ProductService productService;
      @Autowired
      HttpServletRequest request;
      
      
    @RequestMapping("addCart")
	public JsonResult addCart(@Param("id")Integer id,@Param("num")Integer num) {
		Product product = productService.findbyId(id);
		CartItem item=new CartItem();
		item.setCount(num);
		item.setProduct(product);
		Cart cart=getCart();
		cart.addCart(item);
		return new JsonResult("添加购物车成功");
	}
	
	private Cart getCart() {
		HttpSession session = request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		if (cart==null) {
			cart = new Cart();
			session.setAttribute("cart", cart);
		}
		return cart;
	}
}
