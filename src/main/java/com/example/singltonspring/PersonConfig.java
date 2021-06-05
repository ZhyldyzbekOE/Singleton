package com.example.singltonspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = com.example.singltonspring.Author.class)
public class PersonConfig {

    @Bean(name = "person")
    public Person getPerson(){
        return new Person("Azamat", 22);
    }


}
