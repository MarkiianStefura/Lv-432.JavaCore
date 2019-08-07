package ua.com.softserve.homework2;

public class Main {

    public static void main(String[] args) {

        Person prs1 = new Person("Ivan", "Ivanenko", 1990);
        Person prs2 = new Person("Taras", "Tarasenko", 1985);
        Person prs3 = new Person("Igor", "Igorenko", 1987);
        Person prs4 = new Person("Andris", "Andriyenko", 1993);
        Person prs5 = new Person();
        prs5.input("Markiian", "Stefura", 1988);


        prs1.output();
        prs2.output();
        prs3.output();
        prs4.output();
        prs5.output();

    }
}
