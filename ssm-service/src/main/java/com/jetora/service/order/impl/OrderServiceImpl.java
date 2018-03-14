package com.jetora.service.order.impl;

import com.jetora.dao.order.OrderMapper;
import com.jetora.pojo.Order;
import com.jetora.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderMapper orderMapper;
    @Override
    public int insertOrder(Order model){
        return orderMapper.insert(model);
    }
    @Override
    public int deleteOrderById(Long orderId){
        return orderMapper.delete(orderId);
    }

}
