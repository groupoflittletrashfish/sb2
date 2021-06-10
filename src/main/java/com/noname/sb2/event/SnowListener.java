package com.noname.sb2.event;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/1 14:35
 * @description：
 * @modified By：
 * @version:
 */
public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowWeather) {
            System.out.println("hello," + event.getWeather());
        }
    }
}
