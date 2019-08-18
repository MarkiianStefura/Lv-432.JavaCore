package com.company.Task1;

public class NonFlyingBird extends Birds {

    public NonFlyingBird(String feather, int layEggs) {
        super(feather, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");

    }

    @Override
    public String toString() {
        return "NonFlyingBird{} " + super.toString();
    }
}
