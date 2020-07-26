package com.example.demo.test2;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/26 17:34
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JuicingConfig.class)
public class JuicingTest {


    @Autowired
    private Apple apple;

    @Test
    public void beginJuicing(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(JuicingConfig.class);

        JoyoungJuicer joyoungJuicer = (JoyoungJuicer) applicationContext.getBean("joyoungJuicer");
        joyoungJuicer.juicing(apple);
    }
}
