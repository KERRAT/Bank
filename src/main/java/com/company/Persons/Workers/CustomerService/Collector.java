package com.company.Persons.Workers.CustomerService;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithClients;
import com.company.Persons.Workers.interfaces.WorkWithEvaluation;
import com.company.Persons.Workers.interfaces.WorkWithMilitaryEquipment;

public class Collector extends Worker implements WorkWithClients, WorkWithEvaluation, WorkWithMilitaryEquipment {
    public Collector(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void ServeCustomer() {

    }

    @Override
    public void Evaluate() {

    }

    @Override
    public void UseWeapon() {

    }
}
