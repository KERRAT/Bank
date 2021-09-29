package com.company.Persons;

import java.util.Objects;

public abstract class Worker extends Person {
    protected int salary;


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
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
        return CharSequence.compare(name, c.name) == 0
                && CharSequence.compare(dateOfBirth,c.dateOfBirth) == 0
                && age == c.age
                && salary == c.salary;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age,dateOfBirth,salary);
    }
}
