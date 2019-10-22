package com.cy.pj.service.impl;

import com.cy.pj.dao.ShopDao;
import com.cy.pj.pojo.Shop;
import com.cy.pj.sevice.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopDao shopDao;

    @Override
    public List<Shop> selectShop() {
        return shopDao.selectShop();
    }

    @Override
    public List<Shop> selectShopLimitTwo() {
        return shopDao.selectShopLimitTwo();
    }

    @Override
    public void updateShop(Integer id) {
        shopDao.updateShop("1", id);
    }

    @Override
    public List<Shop> selectCarts() {
        return shopDao.selectCarts();
    }

    @Override
    public String findAllCount() {
        return shopDao.findAllCount();
    }

    @Override
    public int returnPrice() {
        int price = 0;
        List<Shop> shopList = shopDao.selectCarts();
        for (Shop carts: shopList){
            price += Integer.parseInt(carts.getShopPrice());
        }
        return price;
    }

    @Override
    public int selectShopPrice(Integer id) {
        return Integer.parseInt(shopDao.selectShopPrice(id));
    }

    @Override
    public void updateCarts(Integer id) {
        shopDao.updateCarts(id);
    }

    @Override
    public List<Shop> selectShopById(Integer id) {
        return shopDao.selectShopById(id);
    }
}
