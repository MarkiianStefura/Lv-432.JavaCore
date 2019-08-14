import java.util.Scanner;

public class ploha {





        public static void main(String args[]){

            System.out.println( "Введіть Радіус ");
            Scanner scan = new Scanner(System.in);
            double rad = Double.parseDouble(scan.nextLine());
            Double s= 3.14 + rad*rad;
            Double p = 2*3.14*rad;
            System.out.println("Площа: "  + s);
            System.out.println("Периметр: "  + p);
        }


}
