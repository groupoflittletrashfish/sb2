package com.noname.sb2.ioc.ann.factoryBean;

import com.noname.sb2.ioc.xml.Animal;
import com.noname.sb2.ioc.xml.Cat;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/2 14:50
 * @description：
 * @modified By：
 * @version:
 */

@Component
public class MyCat implements FactoryBean<Animal> {
    @Override
    public Animal getObject() throws Exception {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }
}
