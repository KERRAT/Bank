package com.company.Moneys;

import com.company.Money;
import org.apache.log4j.Logger;

public class UAH extends Money {
    private Logger log = Logger.getLogger(RUB.class);

    public UAH(double amount) {
        super(amount);
    }
    @Override
    public RUB convert_to_RUB() {
        double rub =  this.getAmount()*this.getUah_to_rub();
        log.info(String.format("Конвертація UAH -> RUB, k = %f: %f -> %f",
                this.getUah_to_rub(),
                this.getAmount(),
                rub));
        return new RUB(rub);
    }

    @Override
    public USD convert_to_USD() {
        double usd =  this.getAmount()/this.getUsd_to_uah();
        log.info(String.format("Конвертація UAH -> USD, k = %f: %f -> %f",
                1/this.getUsd_to_uah(),
                this.getAmount(),
                usd));
        return new USD(usd);
    }

    @Override
    public Money convert_to_UAH() {
        return this;
    }

}
