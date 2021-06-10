package com.noname.sb2.timer;

import org.springframework.util.StopWatch;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/4 14:19
 * @description：
 * @modified By：
 * @version:
 */
public class MyWatch {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch("stopWatch");
        stopWatch.start("task1");
        Thread.sleep(2000);
        stopWatch.stop();

        stopWatch.start("task2");
        Thread.sleep(3000);
        stopWatch.stop();

        stopWatch.start("task3");
        Thread.sleep(1000);
        stopWatch.stop();
        //输出统计数据
        System.out.println(stopWatch.prettyPrint());
    }
}
