package com.thmjy.joker.controller;

import com.thmjy.joker.entities.CommonResult;
import com.thmjy.joker.entities.Payment;
import com.thmjy.joker.service.IPaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private IPaymentFeignService iPaymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return iPaymentFeignService.getPaymentById(id);
    }

}
