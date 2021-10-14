package com.company.Persons.Workers.Secur;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithMilitaryEquipment;
import com.company.Persons.Workers.interfaces.WorkWithTechnicalEquipment;

public class BankingAgent extends Worker implements WorkWithTechnicalEquipment, WorkWithMilitaryEquipment {
    public BankingAgent(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void WorkWithTechnique() {

    }

    @Override
    public void UseWeapon() {

    }
}
