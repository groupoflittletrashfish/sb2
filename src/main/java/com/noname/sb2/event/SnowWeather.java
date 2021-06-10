package com.noname.sb2.event;

/**
 * 事件-下雪
 * @author ：liwuming
 * @date ：Created in 2021/6/1 14:31
 * @description：
 * @modified By：
 * @version:
 */
public class SnowWeather  extends WeatherEvent{
    @Override
    public String getWeather() {
        return "snow";
    }
}
