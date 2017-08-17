package com.ym.spring.learn.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

/**
 * Created by ym on 2017/8/17.
 */
@Configuration
@ComponentScan("com.ym.spring.learn.ch2.el")
@PropertySource("classpath:com/ym/spring/learn/ch2/el/test.properties")
public class ElConfig {
    @Value("I LOVE YOU")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;
    @Value("#{demoService.another}")
    private String fromAnother;
    @Value("classpath:com/ym/spring/learn/ch2/el/text.txt")
    private Resource testFile;
    @Value("http://www.baidu.com")
    private Resource testUrl;
    @Value("${book.name}")
    private String bookName;
}
