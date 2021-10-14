package com.company.Persons.Visitors;

import com.company.CreditTimer;
import com.company.Money;
import com.company.Moneys.USD;
import com.company.Persons.Person;
import org.springframework.scheduling.annotation.Async;

import java.util.Timer;
import java.util.TimerTask;

public class Client extends Person {
    private boolean isInBlackList = false;
    private boolean isVIP = false;
    private boolean haveCredits = false;
    private boolean isCreditable = true;
    private double moneyOnAcc = 0;
    private double credit = 0;

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
    }

    public Client(String name, int age, String passport, String dateOfBirth, boolean isInBlackList, boolean isVIP, boolean haveCredits, boolean isCreditable) {
        super(name, age, passport, dateOfBirth);
        this.isInBlackList = isInBlackList;
        this.isVIP = isVIP;
        this.haveCredits = haveCredits;
        this.isCreditable = isCreditable;
    }

    @Async
    public void takeCredit(double amount) {
        credit = amount;
        haveCredits = true;
        TimerTask timerTask = new CreditTimer();
        // стартуем TimerTask в виде демона
        Timer timer = new Timer(true);
        // будем запускать каждых 10 секунд (10 * 1000 миллисекунд)
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        System.out.println("TimerTask начал выполнение");
        // вызываем cancel() через какое-то время
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask прекращена");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void takeMoneyFromAccount(Money amount) {
        if(amount instanceof USD) {
            if (moneyOnAcc - amount.getAmount() >= 0) {
                moneyOnAcc -= amount.getAmount();
            } else {
                //виведення повідомлення про недостаток грошей
            }
        }else{
            if (moneyOnAcc - amount.convert_to_USD().getAmount() >= 0) {
                moneyOnAcc -= amount.convert_to_USD().getAmount();
            } else {
                //виведення повідомлення про недостаток грошей
            }
        }
    }


    public void putMoneyOnAccount(Money amount) {
        if (amount instanceof USD) {
            moneyOnAcc -= amount.getAmount();
        } else {
            moneyOnAcc += amount.convert_to_USD().getAmount();
        }
    }
}
