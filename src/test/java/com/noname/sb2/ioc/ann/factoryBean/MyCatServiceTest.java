package com.noname.sb2.ioc.ann.factoryBean;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
class MyCatServiceTest {

    @Resource
    private MyCatService myCatService;


    @Test
    public void getName() {
        System.out.println(myCatService.hello());
    }
}