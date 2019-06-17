package com.shop.ribbon.controller;

import com.shop.ribbon.Product.Products;
import com.shop.ribbon.service.HelloService;
import org.apache.activemq.broker.region.Topic;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.servlet.http.HttpServletRequest;

/**
 * @author tqj
 * @Description
 * @create 2019/5/20 10:34
 **/
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @Autowired
    private Products products;
    //注入存放消息的队列，用于下列方法一
    @Autowired
    private Queue queue;
   /* @Autowired
    private Topic topic;*/

    //注入springboot封装的工具类
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @GetMapping("/hello")
    public String sayHello(String name, HttpServletRequest request){
        Destination destination = new ActiveMQQueue("mytest.queue");

            products.sendTextMessage(destination,"Queue Message"+request.getParameter("a"));
           // jmsMessagingTemplate.convertAndSend(queue, "tqj"+i);
     /*   for (int i = 10;i<8;i++){
        }*/
        return helloService.sayHello() + " " + name;
    }


}

