package com.company.Persons.Workers.Advertising;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithClients;
import com.company.Persons.Workers.interfaces.WorkWithEvaluation;

public class MarketingManager extends Worker implements WorkWithClients, WorkWithEvaluation {
    public MarketingManager(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void ServeCustomer() {

    }

    @Override
    public void Evaluate() {

    }
}
