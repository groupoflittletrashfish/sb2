package com.noname.sb2.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * 需要注意的是泛型对象，即Springboot的监听器顺序，参看印象笔记中的事件发送顺序，多个自定义监听器在同一种事件类型中是按照指定顺序的
 *
 * 4种方式实现，前3种与初始化容器一毛一样，就不做过多介绍，参看initializer包，配置文件方式顺序同样优先于其他方式
 * 第四种方式参看FourthListener,即继承SmartApplicationListener接口，该接口是Springboot监听器底层都会调用的接口，主要实现两个函数，
 * 不要忘记方式4也要通过前三种方式注册，即在配置文件/启动类/META-INF中申明
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/1 17:59
 * @description：
 * @modified By：
 * @version:
 */
@Order(4)
public class FourthListener implements SmartApplicationListener {
    /**
     * 表示该监听器对XX事件感兴趣，如对ApplicationStartedEvent或者ApplicationPreparedEvent事件感兴趣，也就是替代了另外三种方式ApplicationListener
     * 接口中的泛型，更加灵活。这样当springboot prepared时候将会触发将挺起，Start完成的时候也会触发监听器
     * @param eventType
     * @return
     */
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationStartedEvent.class.isAssignableFrom(eventType) || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("hello,fourth");
    }
}
