package com.company.part1;

public class Chicken extends NonFlyingBird {
    public Chicken(int laidEggs, String feathers) {
        super(laidEggs, feathers);
    }

    @Override
    public String toString() {
        return "Chicken{} " + super.toString();
    }
}
