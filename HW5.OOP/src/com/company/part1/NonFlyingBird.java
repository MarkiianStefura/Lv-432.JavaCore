package com.company.part1;

public class NonFlyingBird extends Bird {
    public void fly(){
        System.out.println("I cannot fly!");
    }

    public NonFlyingBird(int laidEggs, String feathers){
        super(laidEggs,feathers);
    }


}