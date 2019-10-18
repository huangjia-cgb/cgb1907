package com.cy.py.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class PageController {
   
	@RequestMapping("doIndexUI")
	public String doIndexUI() {
		return "index";
	}
	@RequestMapping("{moduleUI}")
    public String doMenuUI(@PathVariable String moduleUI) {
   	 return moduleUI;
    }
}
