package com.shop.ribbon.Product;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;


/**
 * @author tqj
 * @Description 发送消息
 * @create 2019/5/25 14:05
 **/
@Service("Products")
public class Products {

    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    public void sendTextMessage(Destination destinationName ,String message){
        System.out.println("------------ 发送消息"+ message);
       // Destination destination = new ActiveMQQueue(destinationName);
       // jmsTemplate.convertAndSend(destination,message);
        jmsTemplate.convertAndSend(destinationName,message);

    }


    //接收回复报文
    @JmsListener(destination="out.queue")
    public void consumerMessage(String text){
        System.out.println("从out.queue队列收到的回复报文为:"+text);
    }


}
