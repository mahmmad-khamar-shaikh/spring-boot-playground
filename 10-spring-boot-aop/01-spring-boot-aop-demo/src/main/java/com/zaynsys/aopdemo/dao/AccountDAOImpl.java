package com.zaynsys.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements  IAccountDAO{
    @Override
    public void addAccount() {
        System.out.println(getClass() + "Doing my db work");
    }
}
