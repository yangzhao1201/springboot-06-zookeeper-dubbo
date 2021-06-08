package com.yang.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author TangYuan
 * @create 2021--06--08--19:48
 * @description
 */

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void getTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心获取信息:" + ticket);
    }
}
