import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.YearMonth;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] daysInMonth = new int[12];
        fillDaysInMonth(daysInMonth);
        System.out.println("Enter the number of month");
        int numberOfMonth = Integer.parseInt(br.readLine());
        System.out.println(daysInMonth[numberOfMonth]);




    }

    private static void fillDaysInMonth(int[] daysInMonth) {
        for (int i = 0; i < daysInMonth.length; i++) {
            daysInMonth[i] = YearMonth.of(LocalDate.now().getYear(), i + 1).lengthOfMonth();
        }
    }
}
