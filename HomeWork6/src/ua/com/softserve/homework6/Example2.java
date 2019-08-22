package ua.com.softserve.homework6;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
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

        System.out.println("Before removing the value:");
        int i = 0;
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println((i + 1) + ". Last name -- " + entry.getKey()
                    + "   First name -- " + entry.getValue());
            i++;
        }

        personMap.values().remove("Taras");
        personMap.values().remove("Taras");

        System.out.println("\nAfter removing the value:");
        int i1 = 0;
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println((i1 + 1) + ". Last name -- " + entry.getKey()
                    + "   First name -- " + entry.getValue());
            i1++;
        }
    }
}
