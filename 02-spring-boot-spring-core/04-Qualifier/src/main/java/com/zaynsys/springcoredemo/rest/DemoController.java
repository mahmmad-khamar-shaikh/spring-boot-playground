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
    public DemoController(@Qualifier("trackCoach") ICoach coach) {
        this.myCoach = coach;
    }

    // Setter injection for reference
//    @Autowired
//    public void setMyCoach(ICoach theCoach){
//        this.myCoach=theCoach;
//    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }
}
