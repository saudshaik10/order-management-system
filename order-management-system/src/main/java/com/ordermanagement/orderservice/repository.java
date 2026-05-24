package com.ordermanagement.orderservice;

import com.ordermanagement.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Order, Long> {
}