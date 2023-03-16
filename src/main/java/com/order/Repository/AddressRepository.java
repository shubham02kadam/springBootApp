package com.order.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Serializable> {

}
