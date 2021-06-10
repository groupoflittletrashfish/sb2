package com.noname.sb2.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * 需要注意的是泛型对象，即Springboot的监听器顺序，参看印象笔记中的事件发送顺序，多个自定义监听器在同一种事件类型中是按照指定顺序的
 *
 * 4种方式实现，前3种与初始化容器一毛一样，就不做过多介绍，参看initializer包，配置文件方式顺序同样优先于其他方式
 * 第四种方式参看FourthListener,即继承SmartApplicationListener接口，该接口是Springboot监听器底层都会调用的接口，主要实现两个函数，
 * 不要忘记方式4也要通过前三种方式注册，即在配置文件/启动类/META-INF中申明
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/1 17:46
 * @description：
 * @modified By：
 * @version:
 */

@Order(2)
public class SecondListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("hello second");
    }
}
