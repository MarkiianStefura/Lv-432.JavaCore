package ua.ivanskyi.secondTask;

public class Start {

	static void sort(Employee[] mass) {

		Employee tmp;

		for (int x = 0; x < mass.length - 1; x++) {
			for (int z = x + 1; z < mass.length; z++) {
				if (mass[x].calculatePay() < mass[z].calculatePay()) {

					tmp = mass[z];
					mass[z] = mass[x];
					mass[x] = tmp;

				}
			}

		}

	}

	public static void main(String[] args) {

		Employee es1 = new SalaryEmployee("manager", "Ivan", "123akkfs88535", 9340);
		Employee es2 = new SalaryEmployee("manager", "Petro", "7586kvndfo44", 8712);
		Employee es3 = new SalaryEmployee("guard", "Andriy", "88vdfvd77a90v", 5873);
		Employee es4 = new SalaryEmployee("accountant", "Maria", "87vdfv9090dv", 7890);

		Employee ec1 = new ContractEmployee("builder", "Ostap", "000dfsf90sf", 20, 240);
		Employee ec2 = new ContractEmployee("builder", "Stepan", "999vsdv8sv8", 25, 240);
		Employee ec3 = new ContractEmployee("cleaner", "Nadia", "4564h64j564h6", 15, 180);

		Employee[] mass = { es1, es2, es3, es4, ec1, ec2, ec3 };
		Start.sort(mass);

		for (Employee x : mass) {
			System.out.println(x.toString());
		}

	}

}
