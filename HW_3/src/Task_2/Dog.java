package Task_2;

public class Dog {

		private String name;
		private Breed breed;
		private int age;

		public Dog(String name, Breed breed, int age) {
			this.name = name;
			this.breed = breed;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Breed getBreed() {
			return breed;
		}

		public void setBreed(Breed breed) {
			this.breed = breed;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		/*
		 * public static void sameName(Dog d1, Dog d2, Dog d3) { if
		 * (d1.getName().equals(d2.getName()) || (d1.getName().equals(d3.getName()) ||
		 * (d2.getName().equals(d3.getName())))) {
		 * System.out.println("We have two dogs with the same name"); } else
		 * System.out.println("Dogs have differents name"); }
		 */
		public static boolean equalsNames(Dog d1, Dog d2, Dog d3) {

			if (d1.getName().equals(d2.getName())) {
				return true;
			}
			if (d1.getName().equals(d3.getName())) {
				return true;
			}
			if (d2.getName().equals(d3.getName())) {
				return true;
			}
			return false;

		}

		public static void oldestDog(Dog d1, Dog d2, Dog d3) {
			if ((d1.getAge() > d2.getAge()) && (d1.getAge() > d3.getAge())) {
				System.out.println("The oldest dog is " + d1.getName() + " has a breed " + d1.getBreed());

			}
			if ((d2.getAge() > d1.getAge()) && (d2.getAge() > d3.getAge())) {
				System.out.println("The oldest dog is " + d2.getName() + " has a breed " + d2.getBreed());
			}
			if ((d3.getAge() > d1.getAge()) && (d3.getAge() > d2.getAge())) {
				System.out.println("The oldest dog is " + d3.getName() + " has a breed " + d3.getBreed());
			}
		}

		@Override
		public String toString() {
			return "Dog: name - " + name + ", breed - " + breed + ", age - " + age;
		}

	}
