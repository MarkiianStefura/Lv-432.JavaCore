package ua.com.softserve.homework5;

import ua.com.softserve.homework5.first.*;
import ua.com.softserve.homework5.second.ContractEmployee;
import ua.com.softserve.homework5.second.Employee;
import ua.com.softserve.homework5.second.SalariedEmployee;
import ua.com.softserve.homework5.second.SalaryCount;

public class Main {

    public static void main(String[] args) {

        Bird[] arrayBird = new Bird[]{
                new Eagle("Grey feathers", 3),
                new Swallow("Black feathers", 5),
                new Penguin("Black with white feathers", 2),
                new Chicken("White", 15)
        };

        for (Bird birds : arrayBird
        ) {
            birds.fly();
            System.out.println(birds.toString());
        }

        System.out.println();
        SalaryCount[] arrayPayment = new SalaryCount[]{
                new ContractEmployee("1", "Ivan", 50, 140, "ID23204281"),
                new ContractEmployee("23", "Yulia", 25, 136, "ID95868340"),
                new SalariedEmployee("15", "Olga", 699, "ID12345678"),
                new SalariedEmployee("99", "Joshua", 1999, "ID87654321")
        };
        double employeeSalary = 0;
        for (SalaryCount z : arrayPayment) {
            System.out.println(z.toString());
            employeeSalary = z.calculatePay() + employeeSalary;
        }
       double averageMonthlyWage = employeeSalary/arrayPayment.length;



        SalaryCount tmp;
        boolean isStop = true;
        for (int i = 0; i < arrayPayment.length; i++) {
            isStop = true;
            for (int j = 0; j < arrayPayment.length - 1 - i; j++) {
                if (arrayPayment[j].calculatePay() < arrayPayment[j + 1].calculatePay()) {
                    tmp = arrayPayment[j];
                    arrayPayment[j] = arrayPayment[j + 1];
                    arrayPayment[j + 1] = tmp;
                    isStop = false;
                }
            }
            if (isStop) {
                break;
            }
        }
        System.out.println();
        System.out.println("Sorted by salary: ");
        for (int i = 0; i < arrayPayment.length; i++) {
            System.out.println( ((Employee)arrayPayment[i]).printName() + " Salary is : " + arrayPayment[i].calculatePay());
    }
        System.out.println(" Average monthly wage = " + averageMonthlyWage);


        }
    }



