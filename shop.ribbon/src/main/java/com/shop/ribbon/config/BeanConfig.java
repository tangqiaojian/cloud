package com.shop.ribbon.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author tqj
 * @Description
 * @create 2019/5/27 10:01
 **/
@Configuration
public class BeanConfig {
    //定义存放消息的队列
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("ActiveMQQueue");
    }

    //定义存放消息的队列
    @Bean
    public Topic topic() {
        return new ActiveMQTopic("ActiveMQQueue");
    }
}
