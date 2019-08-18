package com.company.Task1;

public class Task1 {
    public static void main(String[] args) {

        Birds[] despasito = new Birds[4];
        despasito[0] = new Eagle("Pink",3);
        despasito[1] = new Swallow("Beatiful", 25);
        despasito[2] = new Penguin("Black", 1);
        despasito[3] = new Chiken("Yellow",8);

        for (Birds b:despasito
             ) {
            b.fly();
            System.out.println(b.toString());
        }

    }

}
