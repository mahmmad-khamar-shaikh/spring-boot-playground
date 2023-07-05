package com.zaynsys.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Spend 20 minutes in batting practice";
    }
}
