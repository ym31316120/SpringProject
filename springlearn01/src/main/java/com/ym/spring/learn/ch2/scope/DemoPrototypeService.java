package com.ym.spring.learn.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ym on 2017/8/17.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
