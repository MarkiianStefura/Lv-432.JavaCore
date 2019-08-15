package com.company.part1;

public class Swallow extends FlyingBird {
    public Swallow(int laidEggs, String feathers) {
        super(laidEggs, feathers);
    }

    @Override
    public String toString() {
        return "Swallow{} " + super.toString();
    }
}
