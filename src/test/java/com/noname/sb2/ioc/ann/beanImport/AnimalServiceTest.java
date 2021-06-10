package com.noname.sb2.ioc.ann.beanImport;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(MyBeanImport.class)
class AnimalServiceTest {

    @Resource(name = "as2")
    private AnimalService animalService;

    @Test
    public void getName() {
        System.out.println(animalService.hello());
    }

}