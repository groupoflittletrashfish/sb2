package com.noname.sb2.event;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/1 14:54
 * @description：
 * @modified By：
 * @version:
 */
public class WeatherEventMulticaster extends AbstractEventMulticaster {


    @Override
    void doEnd() {
        System.out.println("end broadcast weather event");
    }

    @Override
    void doStart() {
        System.out.println("begin broadcast weather event");
    }
}
