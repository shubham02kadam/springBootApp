package com.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.order.Exception.EmptyInputException;
import com.order.Repository.orderHeaderRepository;
import com.order.Repository.productInfo;
import com.order.entity.ProductInfo;
import com.order.entity.orderHeader;

@Service
public class service {
	
	@Autowired
	private orderHeaderRepository repo;
	
	@Autowired
	private productInfo productrepo;
	
	public orderHeader saveorder(orderHeader order) {
		
		if(order.getUserName().isEmpty()||order.getUserName().length()==0) {
			throw new EmptyInputException("601","Input Fields are Empty");
			
		}
		
		orderHeader save = repo.save(order);
		
		System.out.println(order);
		return save;
	}
	
public String addproduct( ProductInfo product) {
		
	if(product.getProductName().isEmpty()||product.getProductName().length()==0) {
		throw new EmptyInputException("602","Input Field are Empty");
	}
		ProductInfo productInfo = productrepo.save(product);
		System.out.println(product);
		return "successfully save productInfo";
		
	}

}
