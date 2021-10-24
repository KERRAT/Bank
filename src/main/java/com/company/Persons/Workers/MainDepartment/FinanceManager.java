package com.company.Persons.Workers.MainDepartment;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithMoney;
import com.company.Persons.Workers.interfaces.WorkWithTechnicalEquipment;

public class FinanceManager extends Worker implements WorkWithMoney, WorkWithTechnicalEquipment {
    public FinanceManager(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth, salary);
    }

    @Override
    public void MoneyMenegment() {

    }

    @Override
    public void WorkWithTechnique() {

    }
}
