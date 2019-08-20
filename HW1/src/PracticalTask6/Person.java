package PracticalTask6;

public abstract class Person {
	private String name;
	
	public Person(String name) {		
		this.name = name;
	}

	public abstract String print();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
}
