package com.noname.sb2.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 所谓的Aware其实也就是类的初始化的之前判断是否继承了某些Aware接口，包括自定义的Aware接口，并且将希望初始化的值写入
 *
 * @author ：liwuming
 * @date ：Created in 2022/1/19 13:11
 * @description ：
 * @modified By：
 * @version:
 */

@Component
public class MyAwareProcessor implements BeanPostProcessor {

    private final ConfigurableApplicationContext configurableApplicationContext;

    public MyAwareProcessor(ConfigurableApplicationContext configurableApplicationContext) {
        this.configurableApplicationContext = configurableApplicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Aware) {
            //如果是MyAware的类则从上下文中获取到注册的类并且写入进去，就实现了Aware接口的自定义
            if (bean instanceof MyAware) {
                ((MyAware) bean).setFlag((Flag) configurableApplicationContext.getBean("flag"));
            }
        }
        return bean;
    }
}
