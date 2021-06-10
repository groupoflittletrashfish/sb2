package com.noname.sb2.ioc.ann.configuration;

import com.noname.sb2.ioc.xml.Animal;
import com.noname.sb2.ioc.xml.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：liwuming
 * @date ：Created in 2021/6/2 14:36
 * @description：
 * @modified By：
 * @version:
 */
@Configuration
public class BeanConfiguration {

    @Bean("dog")
    Animal getDog() {
        return new Dog();
    }


    @Bean
    AnimalService animalService(){
        return new AnimalService();
    }

}
