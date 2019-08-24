package ua.com.softserve.homework6;

import java.util.*;

public class Example2 {

    public static boolean sameName(Map<String, String> personMap) {
        Set<String> temporary = new HashSet<String>();
        temporary.addAll(personMap.values());
        return personMap.size() == temporary.size() ? false : true;

    }

    public static void remove(Map<String, String> personMap, String removeName) {
        if (personMap.containsValue(removeName)) {
            for (Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator(); iterator.hasNext(); ) {
                if (iterator.next().getValue().equalsIgnoreCase(removeName)) {
                    iterator.remove();
                }
            }
        }
    }
    public static void main(String[] args) {

        HashMap<String, String> personMap = new HashMap<>();

        personMap.put("Kit", "Taras");
        personMap.put("Bot", "Ivan");
        personMap.put("Got", "Olga");
        personMap.put("Doa", "Denys");
        personMap.put("Zes", "Petro");
        personMap.put("Mor", "Taras");
        personMap.put("For", "Yulia");
        personMap.put("Jov", "Tanya");
        personMap.put("Pol", "Yurii");
        personMap.put("Que", "Taras");

        System.out.println(sameName(personMap));

        System.out.println("Before removing the value:");
        int i = 0;
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println((i + 1) + ". Last name -- " + entry.getKey()
                    + "   First name -- " + entry.getValue());
            i++;
        }

        remove(personMap, "Taras");
        System.out.println("\nAfter removing the value:");
        int i1 = 0;
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println((i1 + 1) + ". Last name -- " + entry.getKey()
                    + "   First name -- " + entry.getValue());
            i1++;
        }
    }
}
