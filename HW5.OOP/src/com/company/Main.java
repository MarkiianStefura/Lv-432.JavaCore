package com.company;

import com.company.part1.*;
import com.company.part2.*;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Chicken(22, "Dark red");
        birds[1] = new Penguin(1, "Black and White");
        birds[2] = new Swallow(2, "Brown");
        birds[3] = new Eagle(3, "Black");

        for (Bird bird : birds
        ) {
            bird.fly();
            System.out.println(bird.toString());
        }

        Salaryable[] peopleOnSalary = new Salaryable[4];

        peopleOnSalary[0] = new ContractEmployee("1",
                "Denys1", 15, 25 * 8, "01T");
        peopleOnSalary[1] = new SalariedEmployee("4",
                "Denys4", 1200, "04S");
        peopleOnSalary[2] = new SalariedEmployee("3",
                "Denys3", 600, "03S");
        peopleOnSalary[3] = new ContractEmployee("2",
                "Denys2", 12, 22 * 8, "02T");


        for (Salaryable s : peopleOnSalary
        ) {
            System.out.println(s.toString());
        }

        sortBySalaryDesc(peopleOnSalary);

        for (Salaryable s : peopleOnSalary
        ) {
            System.out.println(s.toString());
        }
    }

    private static void sortBySalaryDesc(Salaryable[] peopleOnSalary) {
        Salaryable tmp;
        boolean sorted = false;
        System.out.println("\t***Sorting***");
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < peopleOnSalary.length - 1; i++) {
                if (peopleOnSalary[i].calculatePay() < peopleOnSalary[i + 1].calculatePay()) {
                    tmp = peopleOnSalary[i];
                    peopleOnSalary[i] = peopleOnSalary[i + 1];
                    peopleOnSalary[i + 1] = tmp;
                    sorted = false;
                }
            }
        }
    }
}
