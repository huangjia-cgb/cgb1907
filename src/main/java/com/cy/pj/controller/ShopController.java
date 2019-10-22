package com.cy.pj.controller;


import com.cy.pj.pojo.Shop;
import com.cy.pj.service.impl.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShopController {

    @Autowired
    private ShopServiceImpl shopService;

    @RequestMapping(value="price",method = RequestMethod.POST)
    public String price(@RequestParam(value = "id[]") String[] id, HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        int total = 0;
        for (Integer i=0;i<id.length;i++){
            Integer priceId = Integer.parseInt(id[i]);
            total += shopService.selectShopPrice(priceId);
            shopService.updateCarts(priceId);
        }
        session.setAttribute("total",total);
        return "redirect:/checkout";
    }

    /**
     * 进入商品首页
     * @param model
     * @return
     */
    @RequestMapping("/shop")
    public String shop(Model model){
        model.addAttribute("price", shopService.returnPrice());
        model.addAttribute("count", shopService.findAllCount());
        model.addAttribute("shop", shopService.selectShop());
        model.addAttribute("shopTwo", shopService.selectShopLimitTwo());
        return "shop";
    }

    /**
     * 获取商品ID，进行收藏
     * @param shop
     */
    @RequestMapping(value="getId",method = RequestMethod.POST)
    @ResponseBody
    public void getId(@RequestBody Shop shop){
        Integer id = shop.getId();
        shopService.updateShop(id);
    }

    @RequestMapping("/carts")
    public String carts(Model model){
        model.addAttribute("price", shopService.returnPrice());
        model.addAttribute("count", shopService.findAllCount());
        model.addAttribute("carts", shopService.selectCarts());
        model.addAttribute("shopTwo", shopService.selectShopLimitTwo());
        return "cart";
    }

    @RequestMapping("/checkout")
    public String checkout(Model model, HttpServletRequest request){
        String total = request.getSession().getAttribute("total").toString();
        if (total != null){
            model.addAttribute("total", total);
        }else {
            model.addAttribute("total", shopService.returnPrice());
        }
        model.addAttribute("count", shopService.findAllCount());
        model.addAttribute("shopTwo", shopService.selectShopLimitTwo());
        return "checkout";
    }

    /**
     * 删除购物车
     * @param shop
     * @return
     */
    @RequestMapping(value="deleteCarts",method = RequestMethod.POST)
    public String deleteCarts(@RequestBody Shop shop){
        Integer id = shop.getId();
        shopService.updateCarts(id);
        return "redirect:/carts";
    }

    @RequestMapping("/details/{id}")
    public String details(@PathVariable("id") int id, Model model){
        model.addAttribute("shop", shopService.selectShopById(id));
        return "product-details";
    }

//    @RequestMapping(value="details", method = RequestMethod.POST)
//    public String details(@RequestBody Shop shop){
////        System.out.println(shop.getId());
//        return "redirect:/index";
//    }
}
