package com.example.demo.test2;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/26 17:40
 */

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 主人类
 * 使用@Aspect注解表示这是一个切面
 */
@Aspect
@Component
public class Master {

    @Pointcut("execution(* com.example.demo.test2.IFruits.*(..))")
    public void juice(){}

    /**
     * 榨汁之前
     * 先洗水果
     */
    @Before("juice()")
    public void washFruits(){
        System.out.println("Wash the fruit and press the switch...");
    }

    /**
     * 榨汁之后
     * 喝果汁
     */
    @AfterReturning("juice()")
    public void drinkFruitJuice(){
        System.out.println("Drink fruit juice...");
    }

    /**
     * 榨汁之后
     * 榨汁机坏掉（抛异常了）
     */
    @AfterThrowing("juice()")
    public void juicerBroken(){
        System.out.println("Return of goods...");
    }
}
