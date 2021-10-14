package com.company.Moneys;

import com.company.Money;

public class UAH extends Money {
    public UAH(double amount) {
        super(amount);
    }
    @Override
    public RUB convert_to_RUB() {
        double rub =  this.getAmount()*this.getUah_to_rub();
        return new RUB(rub);
    }

    @Override
    public USD convert_to_USD() {
        double usd =  this.getAmount()/this.getUsd_to_uah();
        return new USD(usd);
    }

    @Override
    public Money convert_to_UAH() {
        return this;
    }

}
