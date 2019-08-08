package com.company;

public class Dog {
    private int age;
    private Breed breed;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(int age, Breed breed, String name) {
        this.age = age;
        this.breed = breed;
        this.name = name;
    }

    public static boolean isSameName(Dog d1, Dog d2) {
        return d1.getName().equals(d2.getName());
    }

    public static Dog oldestDog(Dog d1, Dog d2) {
        return d1.getAge() > d2.getAge() ? d1 : d2;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", breed=" + breed +
                ", name='" + name + '\'' +
                '}';
    }
}
