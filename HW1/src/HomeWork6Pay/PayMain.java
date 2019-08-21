package HomeWork6Pay;

public class PayMain {

	public static void main(String[] args) {
		Employee[]employees = new Employee[4];
		employees[0] = new ContractEmployee("1", 1250, "100");
		employees[1] = new SalariedEmployee("5", 52.5, 10.5, "12345");
		employees[2] = new ContractEmployee("3", 1500, "150");
		employees[3] = new SalariedEmployee("8", 45, 8, "54321");
		
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}

}
