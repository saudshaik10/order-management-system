package com.ordermanagement.customerservice;

import com.ordermanagement.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Customer, Long> {
}