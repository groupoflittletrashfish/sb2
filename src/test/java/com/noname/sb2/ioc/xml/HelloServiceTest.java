package com.noname.sb2.ioc.xml;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(locations = "classpath:ioc/demo.xml")
class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void getStudent() {
    }

    @Test
    void setStudent() {
    }

    @Test
    void hello() {
        System.out.println(helloService.hello());
    }
}