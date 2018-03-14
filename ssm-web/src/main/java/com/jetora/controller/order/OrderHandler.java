package com.jetora.controller.order;

import com.jetora.pojo.Order;
import com.jetora.service.order.OrderService;
import com.jetora.utils.ResponseResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderHandler {
    private static final Logger log = Logger.getLogger(OrderHandler.class);
    @Autowired
    OrderService orderService;

    @Transactional
    @PostMapping(value = "/order/add", produces = { "application/json;charset=UTF-8" })
    public ResponseResult<Order> insertSaveUser(@RequestBody Order order){
        ResponseResult<Order> result = new ResponseResult<>();
        try {
            orderService.insertOrder(order);
            result.setCode(String.valueOf(HttpStatus.OK));
            result.setMsg("insert succeed...");
        } catch (Exception e) {
            result.setCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            result.setMsg("insert failed...");
            log.error("新增Order失败！", e);
        }
        return result;
    }

}
