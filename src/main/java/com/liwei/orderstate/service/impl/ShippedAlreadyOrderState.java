package com.liwei.orderstate.service.impl;

import com.liwei.orderstate.service.OrderState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author liwei
 * @create: 2020/3/17 5:46 下午
 */
@Service
@Slf4j
public class ShippedAlreadyOrderState implements OrderState {

    @Override
    public String orderService() {
        log.info(">>>切换为已经发货状态..");
        return "已经发货..";
    }
}
