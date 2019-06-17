package com.shop.dev.controller;

import com.shop.dev.service.LoginService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.shop.dev.untils.returnObject.printf;

/**
 * @author tqj
 * @Description
 * @create 2019/5/21 9:02
 **/
@RestController
@RequestMapping("LoginController")
public class LoginController {

    @Autowired
    @Qualifier("LoginService")
    LoginService loginService;

    @RequestMapping("login")
    public void login(HttpServletResponse response, HttpServletRequest request){

        System.out.println("进入登录");

        JSONObject j = new JSONObject();
        j.put("msg",loginService.Login());
        printf(response,j);
    }

    @RequestMapping(value = "/dologin/{code}",method = RequestMethod.GET)
    public JSONObject goLogin(@PathVariable("code")String code,HttpServletResponse response, HttpServletRequest request){


        JSONObject j = new JSONObject();
        // j.put("msg","我真好");
        j.put("msg",loginService.Login());
        j.put("code",code);
        return j;
    }



}
