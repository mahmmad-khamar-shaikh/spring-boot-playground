package com.zaynsys.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Spend 20 minutes in batting practice";
    }
}
