package com.sakthi.microservice.service;


import com.sakthi.microservice.entity.Person;
import com.sakthi.microservice.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {

        return personRepository.save(person);
    }

    public Person findPersonbyId(Long personId) {
        log.info("Person ID:"+personId.toString());

        return personRepository.findByPersonId(personId);
    }
}
