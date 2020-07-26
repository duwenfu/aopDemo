package com.example.demo.aopAspectJ;

import com.example.demo.test.aspect;
import org.springframework.stereotype.Service;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/19 17:49
 */
@Service
public class PerformanceImpl implements Performance {
    @Override
    public String perform() {
        try {
            System.out.println("演出～～～");
        } catch (Exception e) {
            throw e;
        }
        return new String("嗒嗒嗒");
    }
}
