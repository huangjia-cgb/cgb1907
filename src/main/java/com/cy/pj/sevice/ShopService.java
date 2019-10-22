package com.cy.pj.sevice;

import com.cy.pj.pojo.Shop;
import org.apache.ibatis.annotations.Param;

import javax.validation.constraints.Max;
import java.util.List;

public interface ShopService {

    public List<Shop> selectShop();

    public List<Shop> selectShopLimitTwo();

    public void updateShop(Integer id);

    public List<Shop> selectCarts();

    public String findAllCount();

    public int returnPrice();

    public int selectShopPrice(Integer id);

    public void updateCarts(Integer id);

    public List<Shop> selectShopById(Integer id);
}
