package com.example.demo.test2;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/26 17:33
 */

import org.springframework.stereotype.Component;

/**
 * 某品牌榨汁机，实现于榨汁机（IJuicer）接口，并实现其榨汁的方法
 */
@Component
public class JoyoungJuicer implements IJuicer {
    @Override
    public void juicing(IFruits fruits) {
        fruits.getJuice();
    }
}
