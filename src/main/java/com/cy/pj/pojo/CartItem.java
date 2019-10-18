package com.cy.pj.pojo;

public class CartItem {
   private Product product;
   private double subTotal;
   private int count;
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public double getSubTotal() {
	return subTotal;
	
}
public void setSubTotal(double subTotal) {
	this.subTotal = count*product.getPrice();
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
@Override
public String toString() {
	return "CartItem [product=" + product + ", subTotal=" + subTotal + ", count=" + count + "]";
}
   
}
