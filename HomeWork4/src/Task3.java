import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
//        arr[0] = 6;
//        arr[1] = 2;
//        arr[2] = 2;
//        arr[3] = 1;
//        arr[4] = 9;
//
        int negetive;
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " int: ");
            negetive = Integer.parseInt(br.readLine());
            if (negetive < 0) {
                break;
            }
            if (negetive % 2 == 0)
                product *= negetive;
            arr[i] = negetive;


        }
        System.out.println("Product of all enterd numbers " + product);

        minimumPositionInSArray(arr);
    }

    public static int position(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > 0) {
                        return j;
                    }
                }
            }
        }
        return -1;
    }

    public static void minimumPositionInSArray(int[] arr) {
        int min = arr[0];
        int position = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                position = i;

            }
        }
        System.out.println(min + " " + position);
    }


}
