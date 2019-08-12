package HomeWork4;

public enum Error {
	HTTPERROR("HTTPError");
	String name;
	private Error(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
		
	}
}
