package com.company.Moneys;

import com.company.Money;
import org.apache.log4j.Logger;

public class USD extends Money {
    private Logger log = Logger.getLogger(RUB.class);

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
        log.info(String.format("Конвертація USD -> RUB, k = %f: %f -> %f",
                this.getUsd_to_rub(),
                this.getAmount(),
                rub));
        return new RUB(rub);
    }

    @Override
    public UAH convert_to_UAH() {
        double uah =  this.getAmount()*this.getUsd_to_uah();
        log.info(String.format("Конвертація USD -> UAH, k = %f: %f -> %f",
                this.getUsd_to_uah(),
                this.getAmount(),
                uah));
        return new UAH(uah);
    }
}
