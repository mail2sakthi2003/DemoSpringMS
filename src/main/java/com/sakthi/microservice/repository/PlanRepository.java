package com.sakthi.microservice.repository;


import com.sakthi.microservice.entity.Person;
import com.sakthi.microservice.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository  extends JpaRepository<Plan,Long> {

    Plan findByPlanId(Long planId);

}
