package com.example.demo.aopAspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author duwen.fu
 * @date 2020/7/19 18:35
 * @version 1.0
 */
@Aspect
@Component
public aspect Audience {

    pointcut perFormance(): execution(*.aopAspectJ.Performance.perform(..));

    before(): perFormance(){
        System.out.println("表演前：手机静音！");
    }

    before(): perFormance(){
        System.out.println("表演前：请坐！");
    }

    after(): perFormance(){
        System.out.println("表演后：鼓掌！！！");
    }

    after()returning(String str): perFormance(){
        System.out.println("调用成功，表演很精彩，鼓掌！！！");
    }

    after()throwing(Exception e): perFormance(){
        System.out.println("调用失败，表演失败，退票！！！");
    }
}
