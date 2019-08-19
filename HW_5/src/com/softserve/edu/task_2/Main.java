package com.softserve.edu.task_2;

public class Main {

	public static void main(String[] args) {
		Calculate[] c=new Calculate[6];
		c[0]=new SalariedEmployee("Petro","S1",100,80,"ssn1");
		c[1]=new ContractEmployee("Oleg","C1",6500,"fti1");
        c[2]=new SalariedEmployee("Iryna","S2",110,75,"ssn2");
		c[3]=new ContractEmployee("Maria","C2",5900,"fti2");
		c[4]=new SalariedEmployee("Vasyl","S3",130,52,"ssn3");
		c[5]=new ContractEmployee("Veronika","C3",6100,"fti3");
		
for (Calculate calculate : c) {
	System.out.println(calculate);
}

System.out.println("\nSorting by salary");
sort(c);
		
	}
	public static void sort(Calculate[] c) {
		Calculate tmp;
		for (int i = 0; i < c.length-1; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i].calculatePay()<c[j].calculatePay()) {
				tmp=c[i];
				c[i]=c[j];
				c[j]=tmp;
				}
			}
			
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			
		}
		
	}

}
