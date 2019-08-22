package HomeWork6Pay;

public class PayMain {

	public static void main(String[] args) {
		Pay[]employees = new Pay[4];
		employees[0] = new ContractEmployee("1", 1250, "100");
		employees[1] = new SalariedEmployee("5", 52.5, 10.5, "12345");
		employees[2] = new ContractEmployee("3", 1500, "150");
		employees[3] = new SalariedEmployee("8", 45, 8, "54321");
		
		
		for (int i = 0; i < employees.length; i++) {
			for (int j = i+1; j < employees.length; j++) {				
				if (employees[i].calculatePay() < employees[j].calculatePay()) {
					Pay trnz = employees[i];
					employees[i] = employees[j];
					employees[j] = trnz;
				}
			}
		}
		
		for (Pay pay : employees) {
			System.out.println(pay.toString());
		}
		
	}

}
