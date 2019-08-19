package ua.com.softserve.homework5.first;

public class Chicken extends NonFlyingBird {
    public Chicken(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Chicken{}" + super.toString();
    }

}
