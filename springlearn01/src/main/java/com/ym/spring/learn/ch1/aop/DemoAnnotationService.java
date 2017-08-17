package com.ym.spring.learn.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by ym on 2017/8/16.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的Add操作")
    public void add(){}
}
