package com.company.Persons.Visitors;

import com.company.Persons.Person;

public class Client extends Person {
    private boolean isInBlackList = false;
    private boolean isVIP = false;
    private boolean haveCredits = false;
    private boolean isCreditable = true;



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

    public Client(String name, int age, String passport, String dateOfBirth, boolean isInBlackList, boolean isVIP, boolean haveCredits, boolean isCreditable) {
        super(name, age, passport, dateOfBirth);
        this.isInBlackList = isInBlackList;
        this.isVIP = isVIP;
        this.haveCredits = haveCredits;
        this.isCreditable = isCreditable;
    }

    public void takeCredit() {

    }

    public void takeMoneyFromAccount() {

    }


    public void putMoneyOnAccount() {

    }
}
