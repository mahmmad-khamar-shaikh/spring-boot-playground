package com.zaynsys.springcoredemo.rest;

import com.zaynsys.springcoredemo.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final ICoach myCoach;
    private final ICoach anotherCoach;


    // Constructor Injection

    //Qualifier  Annotation has priority than @Primary

    public DemoController(
            @Qualifier("baseballCoach") ICoach coach,
            @Qualifier("baseballCoach") ICoach theAnotherCoach
    ) {
        System.out.println("In Constructor " + getClass().getSimpleName());
        this.myCoach = coach;
        this.anotherCoach = theAnotherCoach;
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


    @GetMapping("/check")
    public String check(){
        return "Comparing beans :  myCoach == anotherCoach  " + (myCoach==anotherCoach);
    }

}
