package com.zaynsys.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 25 minutes";
    }
}
