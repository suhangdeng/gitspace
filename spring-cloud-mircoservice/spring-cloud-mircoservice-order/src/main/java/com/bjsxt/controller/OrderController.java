package com.bjsxt.controller;

import com.bjsxt.pojo.Order;
import com.bjsxt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping(value = "/{orderId}")
    public Order queryOrderById(@PathVariable("orderId") String orderId) {
        return this.orderService.queryOrderById(orderId);
    }
}
