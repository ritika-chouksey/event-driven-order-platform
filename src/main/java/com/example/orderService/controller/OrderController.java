package com.example.orderService.controller;

import com.example.orderService.dto.CreateOrderRequest;
import com.example.orderService.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

//    dependency injection
//    constructor asking for service which spring will provide
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/health")
    public String healthCheck(){
        return "Order service is running!";
    }

    @GetMapping("/orders")
    public List<String> getOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping("/orders")
    public String createOrder(@RequestBody CreateOrderRequest request){
        return orderService.createOrder(request);
    }
}
