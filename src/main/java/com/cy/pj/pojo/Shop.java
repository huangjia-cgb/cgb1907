package com.cy.pj.pojo;

public class Shop {

    private int id;
    private String shopName;
    private String shopPrice;
    private String carts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(String shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getCarts() {
        return carts;
    }

    public void setCarts(String carts) {
        this.carts = carts;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", shopPrice='" + shopPrice + '\'' +
                ", carts='" + carts + '\'' +
                '}';
    }
}
