package com.noname.sb2.pro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 演示属性注入的第一种方式，即通过启动类，也就是Sb2Application类写入属性，直接通过硬编码写入
 * 为了验证是否可以正常获取到放入的值，这边使用启动加载器来验证一下
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/4 16:22
 * @description：
 * @modified By：
 * @version:
 */
@Component
public class PropertiesResultRunner implements ApplicationRunner, EnvironmentAware {

    Environment environment;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String name = environment.getProperty("name");
        System.out.println(String.format("name: %s", name));
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
