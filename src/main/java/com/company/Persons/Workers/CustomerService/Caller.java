package com.company.Persons.Workers.CustomerService;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.CleanWorkingPlace;
import com.company.Persons.Workers.interfaces.WorkWithTechnicalEquipment;

public class Caller extends Worker implements WorkWithTechnicalEquipment, CleanWorkingPlace {

    public Caller(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void WorkWithTechnique() {

    }

    @Override
    public void clean() {

    }
}
