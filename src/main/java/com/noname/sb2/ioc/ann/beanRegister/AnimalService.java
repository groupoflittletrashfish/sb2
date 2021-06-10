package com.noname.sb2.ioc.ann.beanRegister;

import com.noname.sb2.ioc.xml.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/2 15:05
 * @description：
 * @modified By：
 * @version:
 */
@Component("as1")
public class AnimalService {

    @Resource
    @Qualifier("cat1")
    private Animal animal;

    public String hello() {
        return animal.getName();
    }
}
