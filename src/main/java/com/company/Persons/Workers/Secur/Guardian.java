package com.company.Persons.Workers.Secur;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithClients;

public class Guardian extends Worker implements WorkWithClients {

    public Guardian(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void ServeCustomer() {


    }
}
