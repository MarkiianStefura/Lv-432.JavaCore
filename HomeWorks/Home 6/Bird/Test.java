package edu.softserve.home;

public class Test {
    public static void main(String[] args) {
        Bird[] birds = {new Pinquin(), new Eagle(), new Chicken(), new Smallow()};
        birds[0].feathers = "a" ;
        birds[1].feathers = "b" ;
        birds[2].feathers = "c" ;
        birds[3].feathers = "d" ;

        birds[0].layEgg = true;
        birds[1].layEgg = true;
        birds[2].layEgg = true;
        birds[3].layEgg = true;

        for (Bird bd : birds) {
            System.out.print("I am " + bd.getClass().getSimpleName() + " and I ");

            System.out.println(bd.fly());
        }
        System.out.println("Full info about me");
        for (Bird bd : birds) {
            System.out.println(bd.toString());
        }
    }
}
