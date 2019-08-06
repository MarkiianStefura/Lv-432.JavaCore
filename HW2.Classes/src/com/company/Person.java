package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Year;

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

    public int getAge() {
        if (birthYear == 0) {
            return 0;
        }
        return LocalDate.now().getYear() - birthYear;
    }

    public void input(BufferedReader bf) throws IOException {

        System.out.print("Person first name = ");
        this.firstName = bf.readLine();

        System.out.print("Person last name = ");
        this.lastName = bf.readLine();

        System.out.print("Person birthday year = ");
        this.birthYear = Integer.parseInt(bf.readLine());

    }

    public void output() {
        System.out.println("Person [ firstName = " + firstName +
                ", lastName = " + lastName + ", age = " + getAge() + "]");
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}
