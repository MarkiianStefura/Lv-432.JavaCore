import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dog{
    private String name;
    private int age;
    private Breed breed;
    enum Breed{
        Boxer,Taxa,Pitbull
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age= age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge(){
        return age;
    }

    Dog(String name,int age,Breed breed){
        this.name = name;
        this.age = age;
        this.breed = breed;

    }


    public static boolean theSameName(Dog d1, Dog d2) {
        return d1.getName().equals(d2.getName());
    }

    public static Dog oldestDog(Dog d1, Dog d2) {
        return d1.getAge() > d2.getAge() ? d1 : d2;
    }

    @Override
    public String toString() {
        return "Dog{" + "age= " + age +", breed= " + breed +", name= " + name + '\'' +'}';
    }

        public static void main(String[]args){
        Dog dog1 = new Dog("Pes",10, Breed.Pitbull);
        Dog dog2 = new Dog("Gav",13,Breed.Boxer);
        Dog dog3 = new Dog("Arsen",15, Breed.Taxa);

        System.out.println("The oldest dog is: ");
        System.out.println(Dog.oldestDog(dog1,(Dog.oldestDog(dog2,dog3))).toString());

        System.out.println("If there dogs with the same name :");
        System.out.println((Dog.theSameName(dog1,dog2)||Dog.theSameName(dog1,dog3))||Dog.theSameName(dog2,dog3));

    }
}