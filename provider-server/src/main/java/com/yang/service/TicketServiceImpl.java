package com.yang.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author TangYuan
 * @create 2021--06--08--19:40
 * @description
 */

@Component
@Service //dubbo.config.annotation.Service  注册到注册中心
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "汤圆是傻子";
    }
}
