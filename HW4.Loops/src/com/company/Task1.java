package com.company;

import java.io.BufferedReader;
import java.time.LocalDate;
import java.time.YearMonth;

import static com.company.Util.safeParseInt;
import static com.company.Util.safeReadLine;

public class Task1 {
    private static int[] daysInMonth;

    public static void writeDaysInMonth(BufferedReader bf) {
        fillDaysInMonth();
        int n = 0;
        while (n < 1 || n > 12) {
            System.out.print("Enter number of month 1-12: ");
            n = safeParseInt(safeReadLine(bf));
        }
        System.out.println("Days in " + n + " month : " + daysInMonth[n]);
    }

    private static void fillDaysInMonth() {
        Task1.daysInMonth = new int[12];
        for (int i = 0; i < daysInMonth.length; i++) {
            daysInMonth[i] = YearMonth.of(LocalDate.now().getYear(), i + 1).lengthOfMonth();
        }
    }
}
