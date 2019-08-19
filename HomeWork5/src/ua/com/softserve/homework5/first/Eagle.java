package ua.com.softserve.homework5.first;

public class Eagle extends FlyingBird {

    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{}" + super.toString();
    }
}
