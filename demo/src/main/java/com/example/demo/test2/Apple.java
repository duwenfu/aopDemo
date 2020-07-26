package com.example.demo.test2;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/26 17:32
 */

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * 苹果类，实现与水果（IFruits）接口，并实现其获取果汁的方法
 */
@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Apple implements IFruits{
    @Override
    public void getJuice() {
        System.out.println("Get some apple juice...");
    }
}
