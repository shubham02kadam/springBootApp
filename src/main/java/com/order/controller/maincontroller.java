package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.orderHeader;
import com.order.service.service;

@RestController
public class maincontroller {
	
	@Autowired
	private service ser;
	
	@PostMapping("/saveorder")
	public orderHeader home(@RequestBody orderHeader order) {
		
		orderHeader saveorder = ser.saveorder(order);
		
		System.out.println(order);
		
		return saveorder;
		
		
		
	}
	
	
	
	
}
