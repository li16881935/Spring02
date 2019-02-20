package com.lanou;

import com.lanou.annonation.Boy;
import com.lanou.aop.Girl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Girl girl = (Girl) context.getBean("girl");
        girl.shopping();
        System.out.println(girl);
    }

    @Test
    void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Boy boy = (Boy) context.getBean("boy");
        boy.coding();

    }
}
