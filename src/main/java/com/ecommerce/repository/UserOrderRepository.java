package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.UserOrder;

public interface UserOrderRepository extends JpaRepository<UserOrder, Integer> {

}