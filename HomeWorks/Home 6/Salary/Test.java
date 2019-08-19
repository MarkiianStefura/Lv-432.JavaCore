package edu.softserve.home;

public class Test {
    public static void main(String[] args) {
        Pay[] employee = new Pay[4];
        employee[0] = new SalariedEmployee(18, 160, "empId_1", "soc_1");
        employee[1] = new SalariedEmployee(10, 100, "empId_2", "soc_2");
        employee[2] = new ContractEmployee(3000, "empId_3", "fed_1");
        employee[3] = new ContractEmployee(2000, "empId_4", "fed_2");

        for (Pay p : employee) {
            System.out.println(p.toString());
        }
        System.out.println();
        System.out.println("After sorting by salary");
        System.out.println();

        sorting(employee);


        for (Pay p : employee) {
            System.out.println(p.toString());
        }
    }

    private static void sorting(Pay[] employee) {
        Pay tmp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < employee.length - 1; i++) {
                if (employee[i].calculatePay() < employee[i + 1].calculatePay()) {
                    tmp = employee[i];
                    employee[i] = employee[i + 1];
                    employee[i + 1] = tmp;
                    sorted = false;
                }
            }
        }
    }
}
