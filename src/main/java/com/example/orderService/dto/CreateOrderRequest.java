package com.example.orderService.dto;

public class CreateOrderRequest {
    private String orderName;
    private int price;

    public String getOrderName(){
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
