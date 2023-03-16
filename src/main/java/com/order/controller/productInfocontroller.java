package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.Repository.productInfo;
import com.order.entity.ProductInfo;
import com.order.service.service;

@RestController
public class productInfocontroller {
	
	@Autowired
	private service ser;
	
	@PostMapping("/saveproduct")
	public ResponseEntity<String> addproduct(@RequestBody ProductInfo product) {
		
		try {
		String addproduct = ser.addproduct(product);
		System.out.println(product);
		return new ResponseEntity<>(addproduct,HttpStatus.CREATED);
		}
		
		catch(Exception e){
			
			String addproduct = ser.addproduct(product);
			
			return new ResponseEntity<>(addproduct,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		
	}

}
