package com.zaynsys.springcoredemo.rest;

import com.zaynsys.springcoredemo.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final ICoach myCoach;
    // Constructor Injection
    //Qualifier  Annotation has priority than @Primary

    public DemoController(@Qualifier("cricketCoach") ICoach coach) {
        System.out.println("In Constructor " + getClass().getSimpleName());
        this.myCoach = coach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }

}
