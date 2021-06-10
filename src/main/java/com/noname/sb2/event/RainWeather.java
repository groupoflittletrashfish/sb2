package com.noname.sb2.event;

/**
 * 事件-下雨
 * @author ：liwuming
 * @date ：Created in 2021/6/1 14:32
 * @description：
 * @modified By：
 * @version:
 */
public class RainWeather extends WeatherEvent{
    @Override
    public String getWeather() {
        return "rain";
    }
}
