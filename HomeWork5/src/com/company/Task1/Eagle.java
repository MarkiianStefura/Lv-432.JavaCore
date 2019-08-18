package com.company.Task1;

public class Eagle extends FlyingBird {

     public Eagle(String feather, int layEggs) {
        super(feather, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{} " + super.toString();
    }
}
