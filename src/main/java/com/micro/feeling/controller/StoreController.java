package com.micro.feeling.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.micro.feeling.StoreEntity;
import com.micro.feeling.service.StoreService;

@Controller
@RequestMapping("/test")
public class StoreController {
	
	@Resource
	private StoreService service;

	@RequestMapping("/show")
	public String toShow(HttpServletRequest request,Model model){
		StoreEntity store = service.getStore(3);
		model.addAttribute("store",JSON.toJSON(store));
		System.out.println("------------pos----------------");
		return "showStore";
	}
}
