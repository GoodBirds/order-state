package com.liwei.orderstate.service.impl;

import com.liwei.orderstate.service.OrderState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author liwei
 * @create: 2020/3/17 5:48 下午
 */
@Component
@Slf4j
public class StateContext {

    private OrderState orderState;

    public StateContext(OrderState orderState) {
        this.orderState = orderState;
    }

    /**
     * 状态流转
     */
    public void switchStateOrder() {
        orderState.orderService();
    }

}
