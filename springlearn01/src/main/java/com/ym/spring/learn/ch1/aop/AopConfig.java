package com.ym.spring.learn.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by ym on 2017/8/17.
 */
@Configuration
@ComponentScan("com.ym.spring.learn.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
