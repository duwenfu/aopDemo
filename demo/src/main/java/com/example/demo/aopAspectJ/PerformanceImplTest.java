package com.example.demo.aopAspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/19 18:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Aspect
@ContextConfiguration(classes = JuicingConfig.class)
public class PerformanceImplTest {

    @Autowired
    Performance performance;

    @Test
    public void begin(){
        performance.perform();
    }
}
