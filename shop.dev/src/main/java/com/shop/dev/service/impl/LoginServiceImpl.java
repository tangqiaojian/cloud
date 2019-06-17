package com.shop.dev.service.impl;

import com.shop.dev.mapper.LoginMapper;
import com.shop.dev.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tqj
 * @Description
 * @create 2019/5/21 15:48
 **/
@Service("LoginService")
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public List<Map<String,Object>> Login(){
        return loginMapper.findUsername();
    }

}
