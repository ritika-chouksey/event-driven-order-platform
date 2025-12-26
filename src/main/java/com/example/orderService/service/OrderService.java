package com.example.orderService.service;

import com.example.orderService.dto.CreateOrderRequest;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class OrderService {
    public String createOrder(CreateOrderRequest request){
        System.out.println("Order name: " + request.getOrderName());
        System.out.println("Order price is: " + request.getPrice());

        return "Order created succesfully";
    }

    public List<String> getAllOrders(){
        return List.of("order-1", "order-2", "order-3");
    }
}
