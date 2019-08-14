import java.util.Scanner;

import java.util.Arrays;

public class Lesson4 {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, 8, 9};
    int max = arr[0];
    int imax = 0;
    int i = 0;
		while(i<arr.lenght)

    {
        if (arr[i] > max) {
            max = arr[i];
            imax = i;
        }
        i++;
    }
		System.out.print("Maximum = "+max);
		System.out.println(" is in "+imax +" place");
}




