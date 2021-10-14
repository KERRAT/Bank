package com.company.Moneys;

import com.company.Money;

public class RUB extends Money {
    public RUB(double amount) {
        super(amount);
    }
    @Override
    public USD convert_to_USD() {
        double usd =  this.getAmount()/this.getUsd_to_rub();
        return new USD(usd);
    }

    @Override
    public UAH convert_to_UAH() {
        double uah =  this.getAmount()/this.getUah_to_rub();
        return new UAH(uah);
    }

    @Override
    public Money convert_to_RUB() {
        return this;
    }


}
