package com.noname.sb2.pro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 演示属性注入的第一种方式，通过启动类并且使用@PropertiesResource注解的方式，加载属性
 * 支持随机数，可以参看money这个属性
 *
 * <p>
 * 本类是为了验证结果
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/4 16:22
 * @description：
 * @modified By：
 * @version:
 */
@Component
public class SecondPropertiesResultRunner implements ApplicationRunner, EnvironmentAware {

    Environment environment;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String age = environment.getProperty("age");
        String money = environment.getProperty("money");
        System.out.println(String.format("age: %s", age));
        System.out.println(String.format("money: %s", money));
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
