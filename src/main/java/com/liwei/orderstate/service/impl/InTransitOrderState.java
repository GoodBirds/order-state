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
public class InTransitOrderState implements OrderState {
    @Override
    public Object orderService() {
        log.info(">>>切换为正在运送状态...");
        return "success";
    }
}
