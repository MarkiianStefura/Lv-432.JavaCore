package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter five words : ");
        String longLine = scanner.nextLine();
        String[] allWords = longLine.split(" ");

        String secondWord = new StringBuffer(allWords[1]).reverse().toString();
        sortDesc(allWords);

        System.out.println("Longest word : \"" + allWords[0] + "\" , length : " + allWords[0].length());
        System.out.println("Second word in reverse order : " + secondWord);
    }


    private static void sortDesc(String[] words) {
        List<String> stringList = Arrays.asList(words);
        stringList.sort(new StringLengthComparatorDesc());
    }

    private static class StringLengthComparatorDesc implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o2.length() - o1.length();
        }
    }


}
