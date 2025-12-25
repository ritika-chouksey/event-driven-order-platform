package com.example.orderService.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    public List<String> getAllOrders(){
        return List.of("order-1", "order-2", "order-3");
    }
}
