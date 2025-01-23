package com.example.order_management.service;

import com.example.order_management.model.Order;
import com.example.order_management.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    //richiamo repository
    private final OrderRepository orderRepository;

    //costruttore
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
}
