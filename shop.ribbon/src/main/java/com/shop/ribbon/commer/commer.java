package com.shop.ribbon.commer;

import com.shop.ribbon.Product.Products;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author tqj
 * @Description
 * @create 2019/5/25 14:28
 **/
@Component
public class commer {
    @JmsListener(destination = "mytest.queue")
    public void listen(String text) {
        System.out.println("<<<========= 收到消息" + text);
    }

    @JmsListener(destination = "mytest.queue")//接收
    @SendTo("out.queue")//回复报文
    public String receiveQueue(String text) {
        System.out.println("Consumer2收到的报文为:" + text);
        return "return message" + text;
    }

    @JmsListener(destination = "ActiveMQQueue")
    // SendTo 会将此方法返回的数据, 写入到 OutQueue 中去.
    @SendTo("SQueue")
    public String handleMessage(String name) {
        System.out.println("成功接受Name" + name);
        return "成功接受Name" + name;
    }

}
