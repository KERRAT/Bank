package com.company.Persons.Workers.MainDepartment;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.CleanWorkingPlace;

public class Cleaner extends Worker implements CleanWorkingPlace {

    public Cleaner(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void clean() {

    }
}
