package com.company.Task1;

public class FlyingBird extends Birds {


    public FlyingBird(String feather, int layEggs) {
        super(feather, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can fly");

    }

    @Override
    public String toString() {
        return "FlyingBird{} " + super.toString();
    }
}
