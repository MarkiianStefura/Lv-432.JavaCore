package PracticalTask4;

public enum Continent {
	EUROPE("Europe"),AMERICA("America"),ASIA("Asia");
	
	String name;
	
	 Continent(String name){
		this.name=name;
	}
	 
	 public String getName(){
		 return name;
	 }
}
