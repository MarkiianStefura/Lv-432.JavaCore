package com.company;

public class Main {

    public static void main(String[] args) {

	Person p1 = new Person();
	p1.setFirstName("Jon");
	p1.setLastName("Snow");
	p1.setBirthYear(1990);

    Person p2 = new Person("Daenerys", "Targaryen");
    p2.setBirthYear(1992);

    Person p3 = new Person("Night","King");
    p3.setBirthYear(1658);

    Person p4 = new Person();
        System.out.println("enter data for 4th person");
        p4.input();

    Person p5 = new Person();
        System.out.println("enter data for 5th person");
        p5.input();


        System.out.println("Age of " + p1.getFirstName() + " is " + p1.getAge());
        System.out.println("Age of " + p3.getFirstName() + " " + p3.getLastName() + " is " + p3.getAge());

        p3.changeName("Cold", "King");

        System.out.println("\nInfo about everybody:");

        System.out.println(p1.output());
        System.out.println(p2.output());
        System.out.println(p3.output());
        System.out.println(p4.output());
        System.out.println(p5.output());
    }
}
