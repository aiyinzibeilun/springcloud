package com.test.consumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api("消费者")
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @ApiOperation("消费者购买商品")
    @RequestMapping("/buy")
    public String buy(String ticket){
        return "消费者"+ticket;
    }
}
