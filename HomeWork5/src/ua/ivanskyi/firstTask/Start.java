package ua.ivanskyi.firstTask;

public class Start {

	public static void main(String[] args) {

		Bird[] mas = { new FlyingBird(true, true, 20), new NonFlyingBird(false, true),
				new Eagle(true, true, 20, "White"), new Swarrow(true, true, 10), new Penguin(false, true),
				new Kiwi(false, true) };

		for (Bird x : mas) {

			x.fly();

		}

	}

}
