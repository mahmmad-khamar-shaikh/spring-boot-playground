package com.zaynsys.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach {
public CricketCoach(){
    System.out.println("In Constructor " + getClass().getSimpleName());
}
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 25 minutes";
    }



    @PostConstruct
    public void doMyStartupStuff(){
    System.out.println("In doMystuff : " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanUpstuff(){
    System.out.println("In PreDestroy steps " + getClass().getSimpleName());
    }

}
