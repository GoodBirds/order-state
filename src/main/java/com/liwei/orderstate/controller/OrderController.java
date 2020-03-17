package com.liwei.orderstate.controller;

import com.liwei.orderstate.service.OrderState;
import com.liwei.orderstate.service.impl.StateContext;
import com.liwei.orderstate.utils.SpringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwei
 * @create: 2020/3/17 5:48 下午
 */
@RestController
public class OrderController {

    @GetMapping("/order")
    public String order(String stateBeanId) {
        //1.使用Spring上下文获取bean中对象
        OrderState orderState = SpringUtils.getBean(stateBeanId, OrderState.class);
        // 2.使用上下文切换到不同的状态
        StateContext stateContext = new StateContext(orderState);
        stateContext.switchStateOrder();
        // 如果写多重if判断的话 整个代码流程 耗时比较长   直接Spring中精准定位到策略或者是状态的话 Map get方法的时候底层是数组
        return "success";
    }
}
