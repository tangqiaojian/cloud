package com.shop.ribbon.service;

import org.springframework.stereotype.Service;

/**
 * @author tqj
 * @Description
 * @create 2019/5/20 10:33
 **/
@Service
public class HelloService {

    public String sayHello(){
        return "helloWorld"; // 提供一个hello World
    }
}
