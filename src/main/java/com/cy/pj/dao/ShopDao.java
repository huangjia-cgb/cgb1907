package com.cy.pj.dao;

import com.cy.pj.pojo.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ShopDao {

    /**
     * 查询全部商品
     * @return
     */
    @Select("select * from shop;")
    List<Shop> selectShop();

    @Select("select * from shop where carts=1 limit 2;")
    List<Shop> selectShopLimitTwo();

    /**
     * 收藏商品
     * @param carts
     * @param id
     */
    @Update("update shop set carts=#{carts} where id=#{id};")
    void updateShop(@Param("carts") String carts, @Param("id") Integer id);

    /**
     * 查询购物车中有多少商品
     * @return
     */
    @Select("select * from shop where carts=1;")
    List<Shop> selectCarts();

    /**
     * 查询有多少条数据
     * @return
     */
    @Select("select count(distinct(id)) from shop where carts=1;")
    String findAllCount();

    /**
     * 查询购物车指定商品金额
     * @param id
     * @return
     */
    @Select("select shop_price from shop where id=#{id};")
    String selectShopPrice(@Param("id") Integer id);


    /**
     * 更新购物车
     * @param id
     */
    @Update("update shop set carts = 0 where id=#{id};")
    void updateCarts(@Param("id") Integer id);

    @Select("select * from shop where id=#{id};")
    List<Shop> selectShopById(Integer id);
}
