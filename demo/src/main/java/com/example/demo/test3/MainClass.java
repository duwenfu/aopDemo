package com.example.demo.test3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/26 21:32
 */
public class MainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");

        Performance piano = context.getBean("piano", Performance.class);
        piano.perform();
        piano.finishPerform("亚莎·海菲兹", "致爱丽斯");

        Performance violin = context.getBean("violin", Performance.class);
        violin.perform();
        violin.finishPerform("霍洛维茨", "爱之喜悦");
    }
}
