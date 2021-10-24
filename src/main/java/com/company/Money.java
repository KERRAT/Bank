package com.company;

import java.util.Objects;

abstract public class Money {

    private double amount;
    final private double usd_to_uah = 5.1;
    final private double usd_to_rub = 501.84;
    final private double uah_to_rub = 98.4;

    public Money(double amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double getUsd_to_uah() {
        return usd_to_uah;
    }

    public double getUsd_to_rub() {
        return usd_to_rub;
    }

    public double getUah_to_rub() {
        return uah_to_rub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return Double.compare(money.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, usd_to_uah, usd_to_rub, uah_to_rub);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount + "у.о." +
                '}';
    }


    public abstract Money convert_to_USD();
    public abstract Money convert_to_UAH();
    public abstract Money convert_to_RUB();
}
