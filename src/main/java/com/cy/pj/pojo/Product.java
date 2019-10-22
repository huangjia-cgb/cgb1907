package com.cy.pj.pojo;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable{
   private static final long serialVersionUID = -601956972293298177L;
   private Integer id;
   private String name;
   private String src;
   private  Double price;
   private String detail;
   private String title;
   private String salePoint;
   private Integer num;
   private Integer cid;
   private Integer status;
   private Date createdtime;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSrc() {
	return src;
}
public void setSrc(String src) {
	this.src = src;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getSalePoint() {
	return salePoint;
}
public void setSalePoint(String salePoint) {
	this.salePoint = salePoint;
}
public Integer getNum() {
	return num;
}
public void setNum(Integer num) {
	this.num = num;
}
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public Integer getStatus() {
	return status;
}
public void setStatus(Integer status) {
	this.status = status;
}
public Date getCreatedtime() {
	return createdtime;
}
public void setCreatedtime(Date createdtime) {
	this.createdtime = createdtime;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", src=" + src + ", price=" + price + ", detail=" + detail
			+ ", title=" + title + ", salePoint=" + salePoint + ", num=" + num + ", cid=" + cid + ", status=" + status
			+ ", createdtime=" + createdtime + "]";
}

}
