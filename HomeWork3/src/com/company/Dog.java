package com.company;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public static Dog older (Dog d1, Dog d2) {
        return (d1.getAge() >= d2.getAge()) ? d1 : d2;
    }

    public static boolean equalName (Dog d1, Dog d2){
        return d1.getName().equals(d2.getName());
    }

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

    @Override
    public String toString() {
        return "Dog {" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }
}

 enum Breed {

    BASTARDO,CORGI,MOPS
 }
