package com.lanou.annonation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Work {

    @Pointcut("bean(boy)||bean(girl)")
    public void abc() {

    }

    @Before("abc()")
    @After("abc()")
    public void printTime1() {
        System.out.println(System.currentTimeMillis());
    }

    public void printTime2() {
        System.out.println(System.currentTimeMillis());
    }
}
