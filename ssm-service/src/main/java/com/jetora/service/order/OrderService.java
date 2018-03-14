package com.jetora.service.order;

import com.jetora.pojo.Order;

public interface OrderService {

    int insertOrder(Order model);

    int deleteOrderById(Long orderId);
}
