package org.briksja.homework.homework02;

public class Person {

    private String pesel;
    private String firstName;
    private String surName;

    public Person(String pesel, String firstName, String surName) {
        setPesel(pesel);
        setFirstName(firstName);
        setSurName(surName);
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    class Person implements IPerson;

    }


}
