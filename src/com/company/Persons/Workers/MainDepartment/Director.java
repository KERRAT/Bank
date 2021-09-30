package com.company.Persons.Workers.MainDepartment;

import com.company.Persons.Worker;
import com.company.Persons.Workers.interfaces.WorkWithClients;
import com.company.Persons.Workers.interfaces.WorkWithEvaluation;
import com.company.Persons.Workers.interfaces.WorkWithMoney;
import com.company.Persons.Workers.interfaces.WorkWithTechnicalEquipment;

public class Director extends Worker implements WorkWithTechnicalEquipment, WorkWithEvaluation, WorkWithClients, WorkWithMoney {
    @Override
    public void ServeCustomer() {

    }

    @Override
    public void Evaluate() {

    }

    @Override
    public void MoneyMenegment() {

    }

    @Override
    public void WorkWithTechnique() {

    }
}
