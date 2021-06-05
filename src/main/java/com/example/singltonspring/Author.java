package com.example.singltonspring;

import com.example.singltonspring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Author {

    PersonService person;

    @Autowired
    public Author(@Qualifier("personServiceImpl") PersonService person) {
        this.person = person;
    }

    public PersonService getPerson() {
        return person;
    }

    public void setPerson(PersonService person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Author{" +
                "person=" + person +
                '}';
    }
}
