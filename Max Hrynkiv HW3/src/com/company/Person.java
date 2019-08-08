package com.company;

import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getAge(){
        return 2019 - birthYear;
    }

    public void input(){
        Scanner reader = new Scanner(System.in);
        String fName = reader.nextLine();
        String lName = reader.nextLine();
        int bYear = reader.nextInt();
        setFirstName(fName);
        setLastName(lName);
        setBirthYear(bYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public String output(){
        return toString();
    }

    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }
}
