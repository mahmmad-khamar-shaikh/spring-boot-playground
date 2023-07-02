package com.zaynsys.springboot.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunrEstController {


    // Injecting properties from application properties
    @Value("${coach.name}")
    private String coachName;


    @Value("${team.name}")
    private String teamName;

    @GetMapping("/team-info")
    public String getTeamInfo() {
        return "Coach: " + this.coachName + " , TeamName:  " + this.teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello There";

    }

    @GetMapping("/workout")
    public String getDailyWorkfout() {
        return "Run a hard 5k";

    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your Lucky day!!!!";
    }
}
