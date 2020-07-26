package com.example.demo.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/21 23:13
 */
public class TestAspect {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDaoImpl studentDao = context.getBean(StudentDaoImpl.class);
        studentDao.insert();
    }
}
