package com.company.Persons;

import java.util.Objects;

public abstract class Worker extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Worker(String name, int age, String passport, String dateOfBirth, int salary) {
        super(name, age, passport, dateOfBirth);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Person)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Worker c = (Worker) o;

        // Compare the data members and return accordingly
        return CharSequence.compare(getName(), c.getName()) == 0
                && CharSequence.compare(getDateOfBirth(),c.getDateOfBirth()) == 0
                && getAge() == c.getAge()
                && salary == c.salary;
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(),getAge(),getDateOfBirth(),salary);
    }
}
