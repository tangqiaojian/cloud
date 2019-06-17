package com.shop.ribbon.commer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.*;

/**
 * @author tqj
 * @Description
 * @create 2019/5/28 17:16
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface soketNice {
    String value() default "FirstAnno";
    // 注释中含有两个参数
    String name() default "Hrmzone";
    String url() default "hrmzone.cn";
}
