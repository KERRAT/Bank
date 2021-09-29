package com.company.Persons.Visitors;

import com.company.Persons.Visitors.interfaces.Credit;
import com.company.Persons.Visitors.interfaces.OperationsWithMoneyOnAccount;
import com.company.Persons.Person;

public class VIP_Client extends Person implements Credit, OperationsWithMoneyOnAccount {

    @Override
    public void takeCredit() {

    }

    @Override
    public void takeMoneyFromAccount() {

    }

    @Override
    public void putMoneyOnAccount() {

    }
}
