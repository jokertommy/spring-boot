package com.thmjy.joker.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.thmjy.joker.service.IPaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
//统一的服务降级fallback方法
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class PaymentHystrixController {
    @Resource
    private IPaymentHystrixService iPaymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    @HystrixCommand
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result = iPaymentHystrixService.paymentInfo_ok(id);
        return result;
    }

    @GetMapping("/conusmer/payment/hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id){
        String result = iPaymentHystrixService.paymentInfo_timeout(id);
        return result;
    }

    public String payment_Global_FallbackMethod(){
        return "服务超时了或服务出错了，请稍后再试。。。。。o(╥﹏╥)o";
    }
}
