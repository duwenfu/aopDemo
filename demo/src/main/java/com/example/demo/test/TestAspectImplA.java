package com.example.demo.test;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/21 22:49
 */
@aspect
public class TestAspectImplA implements TestAspect{
    @Override
    public String test(String sr) {
        System.out.println("run TestAspectImplA.test " + sr);
        return sr;
    }
}
