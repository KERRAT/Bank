package com.company.Persons.Workers.Advertising;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithTechnicalEquipment;

public class Copywriter extends Worker implements WorkWithTechnicalEquipment, WorkWithPublicize{


    public Copywriter(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void WorkWithTechnique() {

    }

    @Override
    public void publicize() {

    }
}
