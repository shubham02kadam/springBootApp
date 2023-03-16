package com.order.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.order.entity.orderitems;

public interface orderitemsRepository extends JpaRepository<orderitems, Serializable> {

}
