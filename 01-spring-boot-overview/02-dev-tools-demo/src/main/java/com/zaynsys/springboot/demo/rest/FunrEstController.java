package com.zaynsys.springboot.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunrEstController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello There";

    }

    @GetMapping("/workout")
    public String getDailyWorkfout(){
        return "Run a hard 5k";

    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your Lucky day!!!!";
    }
}
