package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

        p1.inputInformation("One", "One", 1994);
        p2.inputInformation("Two", "Two", 1973);
        p3.inputInformation("Three", "Three", 1786);
        p4.inputInformation("Four", "Four", 2000);
        p5.inputInformation("Five", "Five", 1982);
        System.out.println(p4.getAge());
        System.out.println(p3.getAge());
        System.out.println(p3.outputInformation());

        p4.setBirthYear(2001);
        p3.changeName("Threee", "Threee");
        System.out.println(p4.getAge());
        System.out.println(p3.outputInformation());
    }
}
