package com.company.part1;

public class Penguin extends  NonFlyingBird{
    public Penguin(int laidEggs, String feathers) {
        super(laidEggs, feathers);
    }

    @Override
    public String toString() {
        return "Penguin{} " + super.toString();
    }
}
