package com.sakthi.microservice.controller;

import com.sakthi.microservice.entity.Person;
import com.sakthi.microservice.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

   @RestController
   @RequestMapping("/persons")
   @Slf4j
public class PersonServiceController {


    @Autowired
    private PersonService personService;

    @PostMapping("/")
    public Person savePerson(@RequestBody Person person)
    {
        log.info("Inside savePerson method controller");
        return personService.savePerson(person);
    }

    @GetMapping("test")
    public String getMappingtest(){


        return "TestMapp";
    }

   @GetMapping("test/{id}")
   public String getMappingtest2(@PathVariable("id") Long personId){


       return "TestMapp Param";
   }

    @GetMapping("/{id}")
    public Person findPersonById(@PathVariable("id") Long personId){
        log.info(" Inside findPersonById method controller");
        return personService.findPersonbyId(personId);

    }

}
