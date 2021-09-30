package com.company.Persons.Workers.MainDepartment;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithEvaluation;

public class Appraiser extends Worker implements WorkWithEvaluation {

    public Appraiser(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void Evaluate() {

    }
}
