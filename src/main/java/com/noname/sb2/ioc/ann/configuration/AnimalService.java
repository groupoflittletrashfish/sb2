package com.noname.sb2.ioc.ann.configuration;

import com.noname.sb2.ioc.xml.Animal;

import javax.annotation.Resource;

/**
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/2 14:39
 * @description：
 * @modified By：
 * @version:
 */
public class AnimalService {

    @Resource(name = "dog")
    private Animal animal;

    public String getName() {
        return animal.getName();
    }
}
