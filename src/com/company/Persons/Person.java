package com.company.Persons;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private String passport;
    private String dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public Person(String name, int age, String passport, String dateOfBirth) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.dateOfBirth = dateOfBirth;
    }

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
