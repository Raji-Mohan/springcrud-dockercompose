package com.galvanize.springcrudpeople.repository;

import com.galvanize.springcrudpeople.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
