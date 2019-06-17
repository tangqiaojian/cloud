package com.shop.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan
@EnableEurekaServer
public class DevApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DevApplication.class, args);
    }

    @Bean
    @Autowired
    @LoadBalanced//负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
