package com.noname.sb2.ioc.xml;

/**
 * 通过XML方式注入的时候也有两种，一种是通过构造器方式，一种为通过set方式
 *
 * 在test内相同的包下进行单元测试
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/2 11:37
 * @description：
 * @modified By：
 * @version:
 */
public class HelloService {

    private Student student;
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String hello() {
        return animal.getName();
    }

    @Override
    public String toString() {
        return "HelloService{" +
                "animal=" + animal +
                '}';
    }
}
