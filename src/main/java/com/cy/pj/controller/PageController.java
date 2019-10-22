package com.cy.pj.controller;

import com.cy.pj.pojo.Shop;
import com.cy.pj.service.impl.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/")
@Controller
public class PageController {

	@Autowired
	private ShopServiceImpl shopService;
   
//	@RequestMapping("doIndexUI")
	@RequestMapping("index")
	public String doIndexUI(Model model) {
		model.addAttribute("price", shopService.returnPrice());
		model.addAttribute("count", shopService.findAllCount());
		model.addAttribute("shopTwo", shopService.selectShopLimitTwo());
		return "index";
	}
	@RequestMapping("{moduleUI}")
    public String doMenuUI(@PathVariable String moduleUI) {
   	 return moduleUI;
    }
}
