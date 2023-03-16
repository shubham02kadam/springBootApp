package com.order.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entity.orderHeader;

public interface orderHeaderRepository extends JpaRepository<orderHeader, Serializable> {

}
