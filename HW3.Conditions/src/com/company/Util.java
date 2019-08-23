package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {

    public static boolean isInRange(float f) {
        return (f >= -5) && (f <= 5);
    }

    public static boolean checkFloatNumbersRange(float f1, float f2, float f3) {
        return isInRange(f1) && isInRange(f2) && isInRange(f3);

    }

    public static int minNumber(int n1, int n2, int n3) {
        return Math.min(n1, Math.min(n2, n3));
    }

    public static int maxNumber(int n1, int n2, int n3) {
        return Math.max(n1, Math.max(n2, n3));
    }

    public static HTTPError httpErrorName(int code) {

        HTTPError httpError;

        switch (code) {
            case 400:
                httpError = HTTPError.BAD_REQUEST;
                break;
            case 401:
                httpError = HTTPError.UNAUTHORIZED;
                break;
            case 402:
                httpError = HTTPError.PAYMENT_REQUIRED;
                break;
            case 403:
                httpError = HTTPError.FORBIDDEN;
                break;
            case 404:
                httpError = HTTPError.NOT_FOUND;
                break;
            case 405:
                httpError = HTTPError.METHOD_NOT_ALLOWED;
                break;
            case 408:
                httpError = HTTPError.REQUEST_TIMEOUT;
                break;
            case 418:
                httpError = HTTPError.IM_A_TEAPOT;
                break;
            default:
                httpError = HTTPError.UNKNOWN_HTTP_ERROR;
        }

        return httpError;
    }

    public static String safeReadLine(BufferedReader bf) {
        String result = "";
        try {
            result = bf.readLine();
        } catch (IOException e) {
            System.out.println("Error encountered getting user input: "
                    + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public static float safeParseFloat(String s) {
        float f = 0;
        try {
            f = Float.parseFloat(s);
            return f;
        } catch (NumberFormatException e) {
            System.out.println("Error encountered parsing user input: "
                    + e.getMessage());
            System.out.println("Setting user input to 0");
        }
        return f;

    }

    public static int safeParseInt(String s) {
        int i = 0;
        try {
            i = Integer.parseInt(s);
            return i;
        } catch (NumberFormatException e) {
            System.out.println("Error encountered parsing user input: "
                    + e.getMessage());
            System.out.println("Setting user input to 0");
        }
        return i;
    }
}
