package com.jetora.dao.order;

import com.jetora.pojo.Order;

public interface OrderMapper {
    int insert(Order record);
    int delete(Long id);
}