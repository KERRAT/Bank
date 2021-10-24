package com.company.Persons.Workers.CustomerService;


import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.CleanWorkingPlace;
import com.company.Persons.Workers.interfaces.WorkWithClients;

public class Consultant extends Worker implements WorkWithClients, CleanWorkingPlace {

    public Consultant(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void ServeCustomer() {

    }

    @Override
    public void clean() {

    }
}
