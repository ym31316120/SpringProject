package com.ym.spring.learn.ch1;

import org.springframework.stereotype.Service;

/**
 * Created by ym on 2017/8/16.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello "+ word;
    }
}
