package ua.com.softserve.homework5.first;

import ua.com.softserve.homework5.first.NonFlyingBird;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin{}" + super.toString();
    }
}
