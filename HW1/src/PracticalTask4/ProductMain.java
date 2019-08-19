package PracticalTask4;

public class ProductMain {

	public static void main(String[] args) {
		Product product1 = new Product("appel", 25.5, 2.2);
		Product product2 = new Product("bananes", 29.8, 1.7);
		Product product3 = new Product("cucumber", 15.7, 4.2);
		Product product4 = new Product("orenge", 19.5, 1.4);
		Product[] sort = new Product[4];
		sort[0] = product1;
		sort[1] = product2;
		sort[2] = product3;
		sort[3] = product4;
		sort = product1.expensivePrice(sort);
		System.out.println(sort[sort.length-1].nameAndqoantity());
		sort = product1.expensiveQoantity(sort);
		System.out.println(sort[sort.length-1].nameBestqoantity());
		
	}

}
