package com.noname.sb2.aware;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 此处继承了自定义的MyAware接口，而MyAware接口在MyAwareProcessor中已经进行了处理，Springboot会扫描这些处理类进行前置处理
 * MyAware申明了一个setFlag的函数，则重写之，由于前置函数的处理，传递的flag就已经是处理过的数据了
 *
 * @author ：liwuming
 * @date ：Created in 2022/1/19 13:20
 * @description ：
 * @modified By：
 * @version:
 */

@Component
public class Test implements ApplicationRunner, MyAware {

    private Flag flag;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("自定义的MyAware接口：" + flag.isCanOperate());
    }

    @Override
    public void setFlag(Flag flag) {
        this.flag = flag;
    }
}
