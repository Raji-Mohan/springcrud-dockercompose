package com.galvanize.springcrudpeople.service;

import com.galvanize.springcrudpeople.model.Person;
import com.galvanize.springcrudpeople.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public Iterable<Person> getAllPerson(){
        return this.repository.findAll();
    }

    public void updatePerson(Person person){
         this.repository.save(person);
    }

    public void addPerson(Person person){
        this.repository.save(person);
    }

    public void deletePerson(Long id){
        this.repository.deleteById(id);
    }
}
