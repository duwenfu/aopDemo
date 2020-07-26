package com.example.demo.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/26 17:53
 */
@ContextConfiguration(classes = JuicingConfig.class)
public class test {
    @Autowired
    private static Apple apple;
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(JuicingConfig.class);

        JoyoungJuicer joyoungJuicer = (JoyoungJuicer) applicationContext.getBean("joyoungJuicer");
        joyoungJuicer.juicing(apple);
    }
}
