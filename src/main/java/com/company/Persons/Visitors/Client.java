package com.company.Persons.Visitors;

import com.company.Money;
import com.company.Moneys.USD;
import com.company.Persons.Person;
import org.apache.log4j.Logger;


public class Client extends Person {
    private boolean isInBlackList = false;
    private boolean isVIP = false;
    private boolean haveCredits = false;
    private boolean isCreditable = true;
    private double moneyOnAcc = 0;
    private double credit = 0;
    private final Logger log = Logger.getLogger(Client.class);



    public double getMoneyOnAcc() {
        return moneyOnAcc;
    }

    public void setMoneyOnAcc(double moneyOnAcc) {
        this.moneyOnAcc = moneyOnAcc;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public boolean isInBlackList() {
        return isInBlackList;
    }

    public void setInBlackList(boolean inBlackList) {
        isInBlackList = inBlackList;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public boolean isHaveCredits() {
        return haveCredits;
    }

    public void setHaveCredits(boolean haveCredits) {
        this.haveCredits = haveCredits;
    }

    public boolean isCreditable() {
        return isCreditable;
    }

    public void setCreditable(boolean creditable) {
        isCreditable = creditable;
    }

    public Client(String name, int age, String passport, String dateOfBirth) {
        super(name, age, passport, dateOfBirth);
        log.info(String.format("Новий клінт!\n  Ім'я: %s\n  Вік: %d\n  ",
                name,
                age));
    }

    public Client(String name, int age, String passport, String dateOfBirth, boolean isInBlackList, boolean isVIP, boolean haveCredits, boolean isCreditable) {
        super(name, age, passport, dateOfBirth);
        this.isInBlackList = isInBlackList;
        this.isVIP = isVIP;
        this.haveCredits = haveCredits;
        this.isCreditable = isCreditable;


    }

    public void takeCredit(Money amount) {
        double money;
        if (amount instanceof USD) {
            money = amount.getAmount();
        } else {
            money = amount.convert_to_USD().getAmount();
        }
        credit += money;
        haveCredits = true;

        log.info(String.format("Клієнт взяв кредит: %f$; Загальна сумма кредиту: %f$",
                money,
                credit));
    }

    public void takeMoneyFromAccount(Money amount) {
        double money;
        if(amount instanceof USD) {
            money = amount.getAmount();
            if (moneyOnAcc - money >= 0) {
                moneyOnAcc -= money;
            } else {
                log.warn(String.format("Недостатньо грошей на рахунку для зняття %f$! Зараз на рахунку: %f$",
                        money,
                        moneyOnAcc));
                return;
            }
        }else{
            money = amount.convert_to_USD().getAmount();
            if (moneyOnAcc - money >= 0) {
                moneyOnAcc -= money;
            } else {
                log.warn(String.format("Недостатньо грошей на рахунку для зняття %f$! Зараз на рахунку: %f$",
                        money,
                        moneyOnAcc));
                return;
            }
        }
        log.info(String.format("Клієнт взяв гроші: %f$; Початкова сумма: %f$; Нова сумма: %f$",
                money,
                moneyOnAcc + money,
                moneyOnAcc));
    }


    public void putMoneyOnAccount(Money amount) {
        double money;
        if (amount instanceof USD) {
            money = amount.getAmount();
        } else {
            money = amount.convert_to_USD().getAmount();
        }
        moneyOnAcc += money;
        log.info(String.format("Клієнт поклав гроші: %f$; Початкова сумма: %f$; Нова сумма: %f$",
                money,
                moneyOnAcc - money,
                moneyOnAcc));
    }
}
