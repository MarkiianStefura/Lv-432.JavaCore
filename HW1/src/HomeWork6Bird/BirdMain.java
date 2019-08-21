package HomeWork6Bird;

public class BirdMain {

	public static void main(String[] args) {
		Bird[] birds = {new Chicken(), new Swallow(), new Eagle(), new Penguin()};
		for (Bird bird : birds) {
			System.out.println(bird.fly());
		}

	}

}
