package com.noname.sb2.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义初始化容器，注册该容器的方法有3种:
 * 1.META-INF/spring.factories方式
 * 2.启动类注册,即在Sb2Application类中申明
 * 3.通过appLication.yml配置文件中申明，该方法@Order会失效，会优先于其他方式
 *
 * 通过DemoController类，test()测试
 * @author ：liwuming
 * @date ：Created in 2021/5/31 17:49
 * @description：
 * @modified By：
 * @version:
 */

@Order(1)
public class FirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        MapPropertySource mapPropertySource = new MapPropertySource("firstInitializer", map);
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("run FirstInitializer");
    }
}
