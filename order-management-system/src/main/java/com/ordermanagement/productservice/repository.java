package com.ordermanagement.productservice;

import com.ordermanagement.productservice.entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Product, Long> {
}