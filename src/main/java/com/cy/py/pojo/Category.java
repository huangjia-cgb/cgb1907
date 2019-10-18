package com.cy.py.pojo;

import java.util.Date;

public class Category {
  
	private Integer id;
	private String name;
	private Integer parenteId;
	private Integer status;
	private Date createdTime;
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
	public Integer getParenteId() {
		return parenteId;
	}
	public void setParenteId(Integer parenteId) {
		this.parenteId = parenteId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", parenteId=" + parenteId + ", status=" + status
				+ ", createdTime=" + createdTime + "]";
	}
	
}
