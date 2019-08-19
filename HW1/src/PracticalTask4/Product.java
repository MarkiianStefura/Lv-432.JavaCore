package PracticalTask4;


public class Product {
	private String name;
	private double price;
	private double qoantity;

	public Product(String name, double price, double qoantity) {
		this.name = name;
		this.price = price;
		this.qoantity = qoantity;				
	}	
	public Product[] expensivePrice(Product[] price) {
		for (int i = 0; i < price.length; i++) {
			for (int j = 0; j < price.length; j++) {
				if (price[i].price < price[j].price) {
					Product[] trnz = new Product[1];
					trnz[0] = price[i];
					price[i] = price[j];
					price[j] = trnz[0];
				}
			}
		}
		return price;
	}
	public Product[] expensiveQoantity(Product[] price) {
		for (int i = 0; i < price.length; i++) {
			for (int j = 0; j < price.length; j++) {
				if (price[i].qoantity < price[j].qoantity) {
					Product[] trnz = new Product[1];
					trnz[0] = price[i];
					price[i] = price[j];
					price[j] = trnz[0];
				}
			}
		}
		return price;


	}
	public String nameAndqoantity() {
		return "Product [name=" + name   + ", qoantity=" + qoantity + "]";
	}
	
	public String nameBestqoantity() {
		return "Product [name=" + name + "]";
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", qoantity=" + qoantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQoantity() {
		return qoantity;
	}

	public void setQoantity(double qoantity) {
		this.qoantity = qoantity;
	}
}
