package com.company.part1;

public class Eagle extends FlyingBird {
    public Eagle(int laidEggs, String feathers) {
        super(laidEggs, feathers);
    }

    @Override
    public String toString() {
        return "Eagle{} " + super.toString();
    }
}
