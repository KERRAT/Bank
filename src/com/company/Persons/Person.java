package com.company.Persons;

import java.util.Objects;

public abstract class Person {
    protected String name;
    protected int age;
    protected String passport;
    protected String dateOfBirth;

    @Override
    public String toString() {
        return "Person{"
                + "fullName ='" + name + '\''
                + ", age =" + age
                + ", passport =" + passport
                + '}';
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
        Person c = (Person) o;

        // Compare the data members and return accordingly
        return CharSequence.compare(name, c.name) == 0
                && CharSequence.compare(passport, c.passport) == 0
                && age == c.age;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age,passport);
    }


}
