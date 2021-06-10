package com.noname.sb2.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 启动加载器有两种方式，分别实现ApplicationRunner和CommandlineRunner接口
 * 两者都会在Springboot加载完成后执行，同样可以使用Order注解来明确对个加载器的顺序，但需要注意的是：
 * 相同Order的ApplicationRunner方式优先于CommandlineRunner，即这两个顺序都为1，那么ApplicationRunner方式先执行
 *
 * @author ：liwuming
 * @date ：Created in 2021/6/4 14:49
 * @description：
 * @modified By：
 * @version:
 */

@Component
@Order(1)
public class FirstCommandlineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //下面一代特殊的代码只是表示颜色输出，打印出来的字体颜色而已
        System.out.println("\u001B[32m >>> startup first runner <<<");
    }
}
