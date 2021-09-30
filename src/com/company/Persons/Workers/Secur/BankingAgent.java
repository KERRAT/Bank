package com.company.Persons.Workers.Secur;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithMilitaryEquipment;
import com.company.Persons.Workers.interfaces.WorkWithTechnicalEquipment;

public class BankingAgent extends Worker implements WorkWithTechnicalEquipment, WorkWithMilitaryEquipment {
    @Override
    public void WorkWithTechnique() {

    }

    @Override
    public void UseWeapon() {

    }
}
