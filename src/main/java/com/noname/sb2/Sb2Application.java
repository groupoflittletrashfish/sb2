package com.noname.sb2;

import com.noname.sb2.initializer.SecondInitializer;
import com.noname.sb2.listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.SpringProperties;

import java.util.Properties;

@SpringBootApplication
@PropertySource("classpath:demo.properties")
public class Sb2Application {

//    public static void main(String[] args) {
//        SpringApplication.run(Sb2Application.class, args);
//    }


    /**
     * 可以通过SpringApplication类来指明添加自定义初始化器和监听器，效果和META-INF/spring.factories添加效果相同
     *
     * @param args
     */
//    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
//        springApplication.addInitializers(new SecondInitializer());
//        springApplication.addListeners(new SecondListener());
//        springApplication.run(args);
//    }


    /**
     * 该方式是属性注入的其中一种方式,直接硬编码，没什么好说的
     *
     * @param args
     */
//    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
//        Properties properties = new Properties();
//        properties.setProperty("name", "noname");
//        springApplication.setDefaultProperties(properties);
//        springApplication.run(args);
//    }


    /**
     * 该方式也是属性注入的一种，不过在启动类上需要使用@PropertySource注解来指明属性文件的位置
     */
    public static void main(String[] args) {
        SpringApplication.run(Sb2Application.class, args);
    }

}
