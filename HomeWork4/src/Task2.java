public class Task2 {
    public static void main(String[] args) {




        int[] sum1 = new int[10];


    }
    public static boolean firstFivePossitive (int[] arr){
        for (int i = 0; i < 5; i++){
            if (arr[i] < 0){
                return false;
            }
        }
        return true;

    }

    public static int sumFristFive (int[] arr){
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int productOfLastFive (int[] arr){
        int product = 1;
        for (int i = 4; i < arr.length; i++){

            product *= arr[i];
        }
        return product;
    }
}
