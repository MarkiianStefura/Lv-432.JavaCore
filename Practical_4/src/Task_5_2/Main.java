package Task_5_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee("Oleg", 3, 3500.0);
		Employee e2 = new Employee("Igor", 3, 3900.0);
		Employee e3 = new Employee("Maria", 2, 4500.0);
		Employee e4 = new Employee("Olga", 1, 3250.0);
		Employee e5 = new Employee("Ilona", 1, 4800.0);

		Employee[] e = { e1, e2, e3, e4, e5 };

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter department number of Employee (1/2/3)");
			int n = Integer.parseInt(scn.next());
		for (Employee emp : e) {
			if (emp.getDepartmentNumber() == n) {
				emp.setDepartmentNumber(n);
				System.out.println(emp);
			}
	

		}
		System.out.println();
		System.out.println("Sorted by Salary");
		Employee employee;
		for (int i = 0; i < e.length; i++) {
			for (int k = i + 1; k < e.length; k++) {
				if (e[i].getSalary() < e[k].getSalary()) {

					employee = e[i];
					e[i] = e[k];
					e[k] = employee;
				}
			}
			System.out.println(e[i]);

		}
	}
}
