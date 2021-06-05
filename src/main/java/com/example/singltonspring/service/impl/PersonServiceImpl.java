package com.example.singltonspring.service.impl;
import com.example.singltonspring.Person;
import com.example.singltonspring.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public Person getPerson() {
        return new Person("IMPL-1",11);
    }

    @Override
    public String toString() {
        return "PersonServiceImpl1{" +
                "name='"+ getPerson().getName() +"\'"+
                ", age='"+ getPerson().getAge() +"'}";
    }
}
