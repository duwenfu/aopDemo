package com.example.demo.aopAspectJ;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/26 17:33
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.example.demo.aopAspectJ")
public class JuicingConfig {
        }
