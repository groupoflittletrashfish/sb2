package com.noname.sb2.ioc.ann.factoryBean;

import com.noname.sb2.ioc.xml.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * MyCat类必须要继承FactoryBean接口并实现，注意不要忘记了Component注解
 * @author ：liwuming
 * @date ：Created in 2021/6/2 14:52
 * @description：
 * @modified By：
 * @version:
 */

@Component
public class MyCatService {

    @Autowired
    @Qualifier("myCat")
    private Animal animal;

    public String hello() {
        return animal.getName();
    }
}
