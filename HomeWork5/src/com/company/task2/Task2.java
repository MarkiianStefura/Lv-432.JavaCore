package com.company.task2;

public class Task2 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new SalaryEmployee("1823", 3200, 228);
        employees[1] = new ContractEmployee("1231", 180, 12.4, 645);
        employees[2] = new SalaryEmployee("6492", 2800, 332);
        employees[3] = new ContractEmployee("2134", 160, 9.3, 932);
        employees[4] = new Employee("6591");

        printConsol(employees);
        arrange(employees);





    }

    static void printConsol(Employee[] employees) {
        double addSalery = 0;

        for (Employee s : employees
        ) {
            System.out.println(s.calculatePay());
            addSalery = s.calculatePay() + addSalery;
        }
        double avarage =  addSalery / employees.length;
        System.out.println("Avarage salery all employes = " + avarage);


    }

    static void arrange(Employee[] employees) {
        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calculatePay() < employees[j].calculatePay()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }
    }
}
