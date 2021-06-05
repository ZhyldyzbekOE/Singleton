package com.example.singltonspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SingltonSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingltonSpringApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);


        Author author = context.getBean("author", Author.class);
        System.out.println(author.getPerson());

    }

}
