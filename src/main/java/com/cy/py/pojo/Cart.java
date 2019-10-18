package com.cy.py.pojo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {
   private double total;
   private Map<String,CartItem>itemMap= new HashMap<>();
   public void addCart(CartItem item) {
	   String pid= String.valueOf(item.getProduct().getId());
	   if(itemMap.containsKey(pid)) {
		   CartItem original=itemMap.get(pid);
		  original.setCount(original.getCount()+item.getCount());
	   }else {
		   itemMap.put(pid, item);
	   }
	   total+=item.getSubTotal();
   }
   
   public void removeItem(String pid) {
	   CartItem remove = itemMap.remove(pid);
	   total-=remove.getSubTotal();
   }
   
   public void clearItem() {
	   itemMap.clear();
	   total=0.0;
   }

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

public Collection<CartItem> getItemMap() {
	return itemMap.values();
}

public void setItemMap(Map<String, CartItem> itemMap) {
	this.itemMap = itemMap;
}
   
}
