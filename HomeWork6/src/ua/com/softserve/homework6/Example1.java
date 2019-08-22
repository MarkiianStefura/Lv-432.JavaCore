package ua.com.softserve.homework6;

import java.util.*;

public class Example1 {


    public static Set<Integer> union(Set<Integer> Set1, Set<Integer> Set2) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Set1);
        set.addAll(Set2);
        return set;
    }

    public static Set<Integer> intersect(Set<Integer> Set1, Set<Integer> Set2) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Set1);
        set.retainAll(Set2);
        return set;
    }

    public static void main(String[] args) {

        Random rd = new Random();

        Set<Integer> Set1 = new HashSet<Integer>();
        Set<Integer> Set2 = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            Set1.add(rd.nextInt(30));
            Set2.add(rd.nextInt(15));
        }
        System.out.println(Set1);
        System.out.println(Set2);

        Set<Integer> unionSet = union(Set1, Set2);
        System.out.println(unionSet);

        Set<Integer> intersectSet = intersect(Set1, Set2);
        System.out.println(intersectSet);

//        List<Integer> Set1 = new ArrayList<>();
//        Set1.add(1);
//        Set1.add(3);
//        Set1.add(5);
//        Set1.add(3);
//        Set1.add(7);
//        List<Integer> Set2 = new ArrayList<>();
//        Set2.add(7);
//        Set2.add(3);
//        Set2.add(6);
//        Set2.add(2);
//        Set2.add(2);
//
//        Set1.addAll(Set2);
//        System.out.println("Union -- " + Set1);
//
//        Set1.retainAll(Set2);
//
//        System.out.println("\n" +Set1);
//        System.out.println(Set2);
    }

}

