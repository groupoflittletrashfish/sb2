package com.noname.sb2.event;

import java.util.ArrayList;
import java.util.List;

/**
 * 广播器，简单理解就是实例化的事件对象每次都必须触发广播器的触发函数，此处也就是multicastEvent方法。
 * @author ：liwuming
 * @date ：Created in 2021/6/1 14:42
 * @description：
 * @modified By：
 * @version:
 */
public abstract class AbstractEventMulticaster implements EventMulticaster {

    private List<WeatherListener> listenerList = new ArrayList<>();

    @Override
    public void multicastEvent(WeatherEvent event) {
        doStart();
        listenerList.forEach(i -> i.onWeatherEvent(event));
        doEnd();

    }

    abstract void doEnd();

    abstract void doStart();

    @Override
    public void addListener(WeatherListener weatherListener) {
        listenerList.add(weatherListener);
    }

    @Override
    public void removeListener(WeatherListener weatherListener) {
        listenerList.remove(weatherListener);
    }

}
