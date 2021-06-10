package com.noname.sb2.ioc.ann.beanImport;

import com.noname.sb2.ioc.xml.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/2 15:19
 * @description：
 * @modified By：
 * @version:
 */

@Component("as2")
public class AnimalService {

    //由于项目启动报错，暂时先注释掉了，正常的bean注入是需要注解的
//    @Resource
//    @Qualifier("cat2")
    private Animal animal;

    public String hello() {
        return animal.getName();
    }
}
