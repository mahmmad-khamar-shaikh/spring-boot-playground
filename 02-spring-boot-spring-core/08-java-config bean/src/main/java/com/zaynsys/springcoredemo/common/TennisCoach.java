package com.zaynsys.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach{

    public TennisCoach(){
        System.out.println("In Constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
