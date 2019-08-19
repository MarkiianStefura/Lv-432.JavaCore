package com.company;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);
        return set3;
    }

    private static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.retainAll(set2);
        return set3;
    }

    private static <T> void printSet(Set<T> set) {
        for (T t : set) {
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("North");
        set1.add("East");
        set1.add("South");

        set2.add("West");
        set2.add("North");
        set2.add("East");
        printSet(union(set1, set2));

        System.out.println();
        printSet(intersect(set1, set2));

    }
}
