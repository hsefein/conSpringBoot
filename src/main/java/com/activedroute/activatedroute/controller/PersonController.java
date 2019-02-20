package com.activedroute.activatedroute.controller;

import com.activedroute.activatedroute.model.Person;
import com.activedroute.activatedroute.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Person> getAllPersons()
    {
        return personRepository.findAll();
    }
}
