package com.rn.domain;

/**
 * Created by level on 2019/12/23.
 */
public class Account {
    private String AccountName;
    private double money;

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountName='" + AccountName + '\'' +
                ", money=" + money +
                '}';
    }
}
