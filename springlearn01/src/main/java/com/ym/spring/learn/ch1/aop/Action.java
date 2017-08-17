package com.ym.spring.learn.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by ym on 2017/8/16.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
