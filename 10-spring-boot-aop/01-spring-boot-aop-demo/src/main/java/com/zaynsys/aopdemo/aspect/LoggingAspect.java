package com.zaynsys.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    // This is where we add all of our related advices for logging

    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n ======= >>> Executing  @Before advice on addAccount()");
    }
}
