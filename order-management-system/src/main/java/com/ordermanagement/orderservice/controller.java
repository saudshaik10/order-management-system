package com.ordermanagement.orderservice.controller;

import com.ordermanagement.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public String placeOrder(@RequestBody String order) {
        return service.placeOrder(order);
    }

    @GetMapping("/{id}")
    public String getOrder(@PathVariable Long id) {
        return service.getOrderById(id);
    }
}