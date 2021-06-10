package com.noname.sb2.ioc.ann.beanRegister;

import com.noname.sb2.ioc.xml.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/2 15:01
 * @description：
 * @modified By：
 * @version:
 */

@Component
public class MyBeanRegister implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        //设置对象的类型
        rootBeanDefinition.setBeanClass(Cat.class);
        //注册对象
        beanDefinitionRegistry.registerBeanDefinition("cat1", rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
