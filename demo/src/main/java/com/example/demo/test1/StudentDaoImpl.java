package com.example.demo.test1;

import org.springframework.stereotype.Service;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/21 23:11
 */
public class StudentDaoImpl {
    //此类没有实现接口，所以使用cglib代理的方法创建出aop代理
    //实现接口会使用jdk代理方法创建aop代理

    //连接点方法若是加了final修饰符的话，无法创建aop代理
    //连接点
    public void insert(){
        System.out.println("insert as StudentDaoImpl");
    }
}
