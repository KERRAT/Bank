package com.company.Persons.Workers.CustomerService;


import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.CleanWorkingPlace;
import com.company.Persons.Workers.interfaces.WorkWithClients;

public class Consultant extends Worker implements WorkWithClients, CleanWorkingPlace {

    @Override
    public void ServeCustomer() {

    }

    @Override
    public void clean() {

    }
}
