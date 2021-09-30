package com.company.Persons.Workers.Advertising;

import com.company.Persons.Worker;

public class SMM extends Worker implements WorkWithPublicize {


    public SMM(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void publicize() {

    }
}
