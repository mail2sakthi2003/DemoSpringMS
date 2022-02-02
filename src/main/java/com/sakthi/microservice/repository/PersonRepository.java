package com.sakthi.microservice.repository;

import com.sakthi.microservice.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

Person findByPersonId(Long personId);


}
