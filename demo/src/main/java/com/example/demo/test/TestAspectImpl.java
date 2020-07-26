package com.example.demo.test;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/21 22:48
 */
@aspect
public class TestAspectImpl implements TestAspect{
    @Override
    public String test(String sr) {
        System.out.println("run TestAspectImpl.test " + sr);
        return sr;
    }
}
