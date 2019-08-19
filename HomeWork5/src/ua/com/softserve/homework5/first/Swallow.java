package ua.com.softserve.homework5.first;

import ua.com.softserve.homework5.first.FlyingBird;

public class Swallow extends FlyingBird {

    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow{} " + super.toString();
    }
}
