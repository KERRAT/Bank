package com.company.Persons.Workers.Technological;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithTechnicalEquipment;

public class Technician extends Worker implements WorkWithTechnicalEquipment {
    public Technician(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void WorkWithTechnique() {

    }
}
