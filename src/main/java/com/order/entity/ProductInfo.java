package com.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCT_INFO")
public class ProductInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String productName;
	private Long productNumber;
	private int productQty;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Long productNumber) {
		this.productNumber = productNumber;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", productName=" + productName + ", productNumber=" + productNumber
				+ ", productQty=" + productQty + "]";
	}
	public ProductInfo(Integer id, String productName, Long productNumber, int productQty) {
		super();
		this.id = id;
		this.productName = productName;
		this.productNumber = productNumber;
		this.productQty = productQty;
	}
	public ProductInfo() {
		super();
		
	}

}
