package com.zaynsys.springcoredemo.common;

public class SwimCoach implements ICoach {

    public SwimCoach() {
        System.out.println("In constructor --- > " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 miters as warmup";
    }
}
