package com.company.Persons.Workers;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.CleanWorkingPlace;
import com.company.Persons.Workers.interfaces.WorkWithClients;
import com.company.Persons.Workers.interfaces.WorkWithMoney;

public class Cashier extends Worker implements WorkWithClients, WorkWithMoney, CleanWorkingPlace {

    @Override
    public void ServeCustomer() {

    }

    @Override
    public void MoneyMenegment() {

    }

    @Override
    public void clean() {

    }
}
