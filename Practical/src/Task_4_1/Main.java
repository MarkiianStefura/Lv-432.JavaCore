package Task_4_1;

public class Main {

	public static void main(String[] args) {

		Product p1 = new Product("Phone Samsung", 2000.0, 12);
		Product p2 = new Product("Phone Asus", 2500.0, 9);
		Product p3 = new Product("Phone Nokia", 1000.0, 15);
		Product p4 = new Product("Phone LG", 1940.0, 4);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

		System.out.println("Most expensive product: ");
		if ((p1.getPrice() > p2.getPrice()) && (p1.getPrice() > p3.getPrice()) && (p1.getPrice() > p4.getPrice())) {
			System.out.println("Product name: " + p1.getName() + ", quantity: " + p1.getQuantity());
		}

		if ((p2.getPrice() > p1.getPrice()) && (p2.getPrice() > p3.getPrice()) && (p2.getPrice() > p4.getPrice())) {
			System.out.println("Product name: " + p2.getName() + ", quantity: " + p2.getQuantity());
		}

		if ((p3.getPrice() > p1.getPrice()) && (p3.getPrice() > p2.getPrice()) && (p3.getPrice() > p4.getPrice())) {
			System.out.println("Product name: " + p3.getName() + ", quantity: " + p3.getQuantity());
		}

		if ((p4.getPrice() > p1.getPrice()) && (p4.getPrice() > p2.getPrice()) && (p4.getPrice() > p3.getPrice())) {
			System.out.println("Product name: " + p4.getName() + ", quantity: " + p4.getQuantity());
		}
		

		System.out.println("Product with the biggest quantity: ");

		if ((p1.getQuantity() > p2.getQuantity()) && (p1.getQuantity() > p3.getQuantity())
				&& (p1.getQuantity() > p4.getQuantity())) {
			System.out.println(p1.getName());
		}

		if ((p2.getQuantity() > p1.getQuantity()) && (p2.getQuantity() > p3.getQuantity())
				&& (p2.getQuantity() > p4.getQuantity())) {
			System.out.println(p2.getName());
		}
		if ((p3.getQuantity() > p1.getQuantity()) && (p3.getQuantity() > p2.getQuantity())
				&& (p3.getQuantity() > p4.getQuantity())) {
			System.out.println(p3.getName());
		}

		if ((p4.getQuantity() > p1.getQuantity()) && (p4.getQuantity() > p2.getQuantity())
				&& (p4.getQuantity() > p3.getQuantity())) {
			System.out.println(p4.getName());
		}
	}
}
