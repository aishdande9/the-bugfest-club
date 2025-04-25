package com.launchcode.liftoff.the.bugfest.club.data;

import com.launchcode.liftoff.the.bugfest.club.models.TravelPlan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelPlanRepository extends CrudRepository<TravelPlan, Long> {
}
