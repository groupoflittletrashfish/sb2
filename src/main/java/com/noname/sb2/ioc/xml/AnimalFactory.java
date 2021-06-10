package com.noname.sb2.ioc.xml;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/2 13:43
 * @description：
 * @modified By：
 * @version:
 */
public class AnimalFactory {

    public Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
