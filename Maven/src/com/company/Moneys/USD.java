package com.company.Moneys;

import com.company.Money;

public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public Money convert_to_USD() {
        return this;
    }

    @Override
    public RUB convert_to_RUB() {
        double rub =  this.getAmount()*this.getUsd_to_rub();
        return new RUB(rub);
    }

    @Override
    public UAH convert_to_UAH() {
        double uah =  this.getAmount()*this.getUsd_to_uah();
        return new UAH(uah);
    }
}
