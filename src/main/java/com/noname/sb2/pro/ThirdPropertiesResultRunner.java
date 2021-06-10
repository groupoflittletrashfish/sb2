package com.noname.sb2.pro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 直接通过在appLication.yml配置文件中注入也可以直接使用
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/4 16:41
 * @description：
 * @modified By：
 * @version:
 */
@Component
public class ThirdPropertiesResultRunner implements ApplicationRunner, EnvironmentAware {

    Environment environment;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String cla = environment.getProperty("class");
        System.out.println(String.format("class: %s", cla));
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

}
