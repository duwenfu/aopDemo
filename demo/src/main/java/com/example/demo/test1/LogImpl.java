package com.example.demo.test1;

import org.springframework.stereotype.Service;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/21 23:11
 */
public class LogImpl {
    //通知
        public void beforeInsert(){
        System.out.println("beforeInsert as LogImpl");
    }
    //通知
        public void afterInsert(){
            System.out.println("afterInsert as LogImpl");
        }
}
