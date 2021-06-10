package com.noname.sb2.event;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/1 14:37
 * @description：
 * @modified By：
 * @version:
 */
public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainWeather) {
            System.out.println("hello," + event.getWeather());
        }
    }
}
