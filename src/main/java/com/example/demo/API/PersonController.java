package com.example.demo.API;

import com.example.demo.Model.Person;
import com.example.demo.Service.PersonService;

public class PersonController {

    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
