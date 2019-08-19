package ua.com.softserve.homework5.first;

import ua.com.softserve.homework5.first.Bird;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {

        System.out.println("NotFly!!!");
    }
}
