package com.noname.sb2.event;

/**
 * 监听器模式4要素：事件，监听器，广播器，触发机制
 * 核心的代码都在广播器中，广播器负责管理监听器和触发事件。会根据事件的类型来执行对应的监听器代码
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/1 14:59
 * @description：
 * @modified By：
 * @version:
 */
public class Test {

    public static void main(String[] args) {
        /*
            WeatherEventMulticaster是对AbstractEventMulticaster类的具体实现，目前只是添加了开始和结束的处理，未作额外扩展
            WeatherEventMulticaster作为广播器
         */
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        //广播器中添加了两个监听器
        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);
        //触发事件-下雪，执行AbstractEventMulticaster类的multicastEvent函数，此时类中有两个监听器。该数据根据事件的类型执行对应的监听器函数
        eventMulticaster.multicastEvent(new SnowWeather());
        eventMulticaster.multicastEvent(new RainWeather());
        //此时移除了一个监听器，那么此时AbstractEventMulticaster类中只有一个下雪事件的监听器
        eventMulticaster.removeListener(rainListener);
        eventMulticaster.multicastEvent(new SnowWeather());
        //此时由于监听器只有一个，即使触发了事件-下雨，但由于匹配不到对应的监听器，也就不会触发监听器
        eventMulticaster.multicastEvent(new RainWeather());
    }
}
