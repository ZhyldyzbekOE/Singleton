package com.example.singltonspring.service.impl;

import com.example.singltonspring.Person;
import com.example.singltonspring.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl2 implements PersonService {

    @Override
    public Person getPerson() {
        return new Person("IMPL-2",22);
    }

    @Override
    public String toString() {
        return "PersonServiceImpl2{" +
                "name='"+ getPerson().getName() +"\'"+
                ", age='"+ getPerson().getAge() +"'}";
    }
}
