package com.shop.dev.config;

import com.shop.dev.service.LoginService;
import com.shop.dev.service.impl.LoginServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tqj
 * @Description
 * @create 2019/5/29 14:38
 **/
@Configuration
public class ConfigBean {
    /**
     * 等同于<bean id = "LoginService" class = "xx.xxx.xx.LoginServiceImpl"></bean>
     * */
    @Bean
    public LoginService getLoginService(){
        return new LoginServiceImpl();
    }


}
