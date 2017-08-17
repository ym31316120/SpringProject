package com.ym.spring.learn.ch1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ym on 2017/8/16.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("2323"));
        context.close();
    }
}
