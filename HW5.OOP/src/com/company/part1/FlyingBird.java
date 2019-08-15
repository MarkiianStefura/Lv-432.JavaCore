package com.company.part1;

public class FlyingBird extends Bird {
    public void fly(){
        System.out.println("FlyingBird can fly!");
    }

    public FlyingBird(int laidEggs, String feathers) {
        super(laidEggs, feathers);
    }
}
