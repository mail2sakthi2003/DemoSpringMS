package com.sakthi.microservice.controller;

import com.sakthi.microservice.entity.Plan;
import com.sakthi.microservice.service.PlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plans")
@Slf4j
public class PlanServiceController {

    @Autowired
    private PlanService planService;

    @PostMapping("/")
    public Plan savePlan(@RequestBody Plan plan)
    {
        log.info("Inside savePlan method");
        return planService.savePlan(plan);
    }

    //http://localhost:8080/persons/2
    @GetMapping("/{id}")
    public Plan findPlanById(@PathVariable("id") Long planId){
        log.info(" Inside findPlanById method controller");
        return planService.findPlanbyId(planId);

    }
}
