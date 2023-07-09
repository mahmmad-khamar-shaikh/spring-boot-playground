package com.zaynsys.springcoredemo.config;


import com.zaynsys.springcoredemo.common.ICoach;
import com.zaynsys.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("Aquatic")
    public ICoach swimCoach(){
        return new SwimCoach();
    }
}
