package com.order.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class orderHeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String userName;
	private String usermob;
	private String Email;
	private String productName;
	private Integer purchaseordernumber;
	@CreationTimestamp
	private LocalDate purchaseorderDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private orderitems orderitems;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUsermob() {
		return usermob;
	}

	public void setUsermob(String usermob) {
		this.usermob = usermob;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPurchaseordernumber() {
		return purchaseordernumber;
	}

	public void setPurchaseordernumber(Integer purchaseordernumber) {
		this.purchaseordernumber = purchaseordernumber;
	}

	public LocalDate getPurchaseorderDate() {
		return purchaseorderDate;
	}

	public void setPurchaseorderDate(LocalDate purchaseorderDate) {
		this.purchaseorderDate = purchaseorderDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public orderitems getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(orderitems orderitems) {
		this.orderitems = orderitems;
	}

	@Override
	public String toString() {
		return "orderHeader [Id=" + Id + ", userName=" + userName + ", usermob=" + usermob + ", Email=" + Email
				+ ", productName=" + productName + ", purchaseordernumber=" + purchaseordernumber
				+ ", purchaseorderDate=" + purchaseorderDate + ", address=" + address + ", orderitems=" + orderitems
				+ "]";
	}

}
