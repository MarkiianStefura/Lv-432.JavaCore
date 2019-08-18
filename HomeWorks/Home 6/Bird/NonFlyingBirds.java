package edu.softserve.home;

public class NonFlyingBirds extends Bird {
    @Override
    public String fly() {
        return "Can not fly ";
    }
    @Override
    public String toString(){
        return "I am " +this.getClass().getSimpleName() + " and I have a type of feathers "+this.feathers+
                " . Does i can to lay egg : " + this.layEgg + ". And my possibility to fly: " +this.fly() ;
    }
}
