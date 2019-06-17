package com.shop.consumer;

/**
 * @author tqj
 * @Description
 * @create 2019/5/23 9:02
 **/
public class Dad {
    private Dad(){
        System.out.println("私有");
    }

    public static void sys(){
        Dad dad = new Dad();
        System.out.println("12312");
    }

}
