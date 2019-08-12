package HomeWork4;

public class Dog {
	private String name;
	private Breed breed;
	private int age;
	
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	@Override
	public String toString(){
		return name+" "+breed+" "+age;		
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age < other.age)
			return false;
		return true;
	}	
	
	public String getName() {
		return name;
	}
	

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
