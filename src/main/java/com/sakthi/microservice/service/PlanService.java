package com.sakthi.microservice.service;

import com.sakthi.microservice.entity.Plan;
import com.sakthi.microservice.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {
    @Autowired
    private PlanRepository planRepository;

    public Plan savePlan(Plan plan) {

        return  planRepository.save(plan);
    }

    public Plan findPlanbyId(Long planId) {

        return planRepository.findByPlanId(planId);
    }
}
