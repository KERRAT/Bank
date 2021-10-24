package com.company.Moneys;
import com.company.Money;
import org.apache.log4j.Logger;

public class RUB extends Money {
    private Logger log = Logger.getLogger(RUB.class);

    public RUB(double amount) {
        super(amount);
    }

    @Override
    public USD convert_to_USD() {
        double usd =  this.getAmount()/this.getUsd_to_rub();
        log.info(String.format("Конвертація RUB -> USD, k = %f: %f -> %f",
                1/this.getUsd_to_rub(),
                this.getAmount(),
                usd));
        return new USD(usd);
    }

    @Override
    public UAH convert_to_UAH() {
        double uah =  this.getAmount()/this.getUah_to_rub();
        log.info(String.format("Конвертація RUB -> UAH, k = %f: %f -> %f",
                1/this.getUah_to_rub(),
                this.getAmount(),
                uah));
        return new UAH(uah);
    }

    @Override
    public Money convert_to_RUB() {
        return this;
    }

}
