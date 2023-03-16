package com.order.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entity.ProductInfo;

public interface productInfo extends JpaRepository<ProductInfo, Serializable>{

}
