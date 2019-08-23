import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_3_2 {

    enum HttpError{
        BAD_REQUEST,
        UNAUTHORIZED,
        NOT_FOUND,
        REQUEST_TIMEOUT,
        UNKNOWN_HTTP_ERROR
    }

    public static float a,b,c;
    public static int one,two,three;

    public static boolean checkRange(float a,float b,float c){
        if ((a >= -5 & a <= 5)&(b >= -5 & b <= 5)&(c >= -5 & c <= 5)) return true;
        else return false;
        // можна просто
        // return (a >= -5 & a <= 5)&(b >= -5 & b <= 5)&(c >= -5 & c <= 5);
    }
    public static int maxValues(int a,int b,int c){
        return  Math.max(a,Math.max(b,c));
    }
    public static int minValues(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }

    public static  void main(String[]args) throws IOException {
        String line;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        line = bf.readLine();
        a = Float.parseFloat(line);
        line = bf.readLine();
        b = Float.parseFloat(line);
        line = bf.readLine();
        c = Float.parseFloat(line);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(checkRange(a,b,c));

        line = bf.readLine();
        one = Integer.parseInt(line);
        line = bf.readLine();
        two = Integer.parseInt(line);
        line = bf.readLine();
        three = Integer.parseInt(line);

        System.out.println("max is " +maxValues(one,two,three));
        System.out.println("min is " +minValues(one,two,three));

        System.out.println("Please enter your Http error");
        line = bf.readLine();
        int error = Integer.parseInt(line);

        switch(error) {
            case(400):
                System.out.println( HttpError.BAD_REQUEST);
                break;
            case(401):
                System.out.println(HttpError.REQUEST_TIMEOUT);
                break;
            case(402):
                System.out.println(HttpError.NOT_FOUND);
                break;
            case(404):
                System.out.println(HttpError.UNKNOWN_HTTP_ERROR);
                break;
        }
    }
}
