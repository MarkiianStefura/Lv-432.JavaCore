package com.company;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap();
        personMap.put("lastName0", "firstName0");
        personMap.put("lastName1", "sameName");
        personMap.put("lastName2", "firstName2");
        personMap.put("lastName3", "firstName3");
        personMap.put("lastName4", "firstName4");
        personMap.put("lastName5", "firstName5");
        personMap.put("lastName6", "sameName");
        personMap.put("lastName7", "firstName7");
        personMap.put("lastName8", "firstName8");
        personMap.put("lastName9", "Orest");


        printMap(personMap);
        System.out.println("Is there are at least two persons with same name : " + isSameName(personMap));

        System.out.println("\tRemoving Orest...");
        removingOrestOrOther(personMap);
        printMap(personMap);

        System.out.println("\tRemoving sameName...");
        removingOrestOrOther(personMap, "sameName");
        printMap(personMap);
    }

    private static void printMap(Map<String, String> personsMap) {
        for (Map.Entry<String, String> entry : personsMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void removingOrestOrOther(Map<String, String> personsMap, String... otherNames) {
        if (otherNames.length == 0) {
            removeElement(personsMap, "Orest");
        } else {
            for (String nameToRemove : otherNames) {
                removeElement(personsMap, nameToRemove);
            }
        }
    }

    private static boolean isSameName(Map<String, String> personsMap) {
        Set<String> uniqueNames = new HashSet<>();
        for (Map.Entry<String, String> entry : personsMap.entrySet()) {
            if (!uniqueNames.add(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    private static void removeElement(Map<String, String> personsMap, String nameToRemove) {
        Iterator iterator = personsMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (nameToRemove.equals(entry.getValue())) {
                iterator.remove();
            }
        }
    }
}
