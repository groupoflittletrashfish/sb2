package com.noname.sb2.ioc.ann.beanRegister;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class AnimalServiceTest {


    @Resource(name = "as1")
    private AnimalService animalService;

    @Test
    public void getName() {
        System.out.println(animalService.hello());
    }

}