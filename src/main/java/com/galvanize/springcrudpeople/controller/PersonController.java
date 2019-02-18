package com.galvanize.springcrudpeople.controller;

import com.galvanize.springcrudpeople.model.Person;
import com.galvanize.springcrudpeople.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @CrossOrigin
    @GetMapping("/people")
    public Iterable<Person> getAllPersons(){
        return service.getAllPerson();
    }

    @CrossOrigin
    @PostMapping("/addperson")
    public void addPerson(@RequestBody Person person){
        service.addPerson(person);
    }

    @CrossOrigin
    @PutMapping("/updateperson")
    public void updatePerson(@RequestBody Person person){
        service.updatePerson(person);
    }

    @CrossOrigin
    @DeleteMapping("/deleteperson")
    public void deletePerson(@RequestParam(required = true, name ="id") Long id){
        service.deletePerson(id);
    }

}
