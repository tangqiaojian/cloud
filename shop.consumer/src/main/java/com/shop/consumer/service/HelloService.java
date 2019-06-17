package com.shop.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedOutputStream;

/**
 * @author tqj
 * @Description
 * @create 2019/5/20 10:33
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    public String sayHello(){
        return restTemplate.getForObject("http://dev/LoginController/login",String.class); // 提供一个hello World
    }




}
