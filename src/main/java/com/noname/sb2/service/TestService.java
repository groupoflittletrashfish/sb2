package com.noname.sb2.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author ：liwuming
 * @date ：Created in 2021/5/31 17:58
 * @description：
 * @modified By：
 * @version:
 */

@Component
public class TestService implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public String test() {
        return applicationContext.getEnvironment().getProperty("key3");
    }
}
