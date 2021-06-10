package com.noname.sb2.ioc.ann.beanImport;

import com.noname.sb2.ioc.xml.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * 基本与beanRegister相同，不同的是在调用的时候需要使用@Import注解将该类引入进来，详细看单元测试
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/2 15:18
 * @description：
 * @modified By：
 * @version:
 */
@Component
public class MyBeanImport implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        //设置对象的类型
        rootBeanDefinition.setBeanClass(Cat.class);
        //注册对象
        registry.registerBeanDefinition("cat2", rootBeanDefinition);
    }
}
